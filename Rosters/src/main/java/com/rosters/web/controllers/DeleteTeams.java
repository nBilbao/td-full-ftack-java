package com.rosters.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rosters.web.models.Roster;

/**
 * Servlet implementation class DeleteTeams
 */
@WebServlet("/DeleteTeams")
public class DeleteTeams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTeams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		Roster equipos = new Roster();
		
		int id_team = Integer.parseInt(request.getParameter("id"));
		
		if(session.getAttribute("teamDeleted")==null) {
			
			request.setAttribute("teams",id_team);
        	
        }
		else {
			request.setAttribute("teams",id_team);
			
		}
		
		if(request.getParameter("id") != null) {
			equipos.eliminarTeam(id_team);
			
			
			
			
			
		}
		response.sendRedirect("Home");
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
