package com.greatNameNumber.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.greatNameNumber.web.models.Number;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/index.jsp");
        view.forward(request, response);
        //response.sendRedirect("/NombreDelProyecto/conectado_controlador.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Number number = new Number();
		HttpSession user = request.getSession();
		
		
		
		
		if(user.getAttribute("target")==null) {
			
			
			user.setAttribute("target", number.getNumber());
			
		}
	
		if(request.getParameter("number")!="") {
			
			String numberString = request.getParameter("number");
			Integer number2 = Integer.parseInt(numberString);
			
			user.setAttribute("number", number2);
			
			
				
		}
		
		if(user.getAttribute("resultado")==null) {
			
			Boolean resultado = user.getAttribute("target") == user.getAttribute("number");
			
			user.setAttribute("resultado", resultado );
			
			
		}
		else {
			Boolean resultado = user.getAttribute("target") == user.getAttribute("number");
			
			user.setAttribute("resultado", resultado );
			
		}
		

		
		
		
		
		
        
        
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/index.jsp");
        view.forward(request, response);
	    
		
		
		
		
		
		

	}
}
