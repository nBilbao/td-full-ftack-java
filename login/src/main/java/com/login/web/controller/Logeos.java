package com.login.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.web.models.Control;
import com.login.web.models.Usuario;

/**
 * Servlet implementation class logeos
 */
@WebServlet("/logeos")
public class Logeos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logeos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/login.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email= request.getParameter("email");
		String pass = request.getParameter("password");
		
		Usuario userPrueba1 = new Usuario("123","nbilbao.s@gmail.com");
		Usuario userPrueba2 = new Usuario("123","nemesiobilbao@outlook.com");
		
		Control dataBase = new Control();
		
		
		
		dataBase.setUser(userPrueba1);
		dataBase.setUser(userPrueba2);
		
		request.setAttribute("dataBase", dataBase);
		
		
		
		
		
		
		
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/login.jsp");
        view.forward(request, response);
	}

}
