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
import com.rosters.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/Teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		HttpSession session = request.getSession();
//		int id_team = Integer.parseInt(request.getParameter("name"));
//		
//		if(session.getAttribute("teamDeleted")==null) {
//			
//			request.setAttribute("teams",id_team);
//        	
//        }
//		else {
//			request.setAttribute("teams",id_team);
//			
//		}
		String teamName = request.getParameter("id");
		
		
        
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewTeam.jsp");
        view.forward(request, response);
        
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String teamName = request.getParameter("name");
		
        
        if(teamName!=null) {
        	
            Team team = new Team(teamName);
            Roster lista =null;

            
            HttpSession session = request.getSession();
            
            if(session.getAttribute("teams")==null) {
            	
            	lista = new Roster();
            	lista.setTeams(team);
            	session.setAttribute("teams", lista);
            }
            else {
            	
            	lista = (Roster)session.getAttribute("teams");
            	lista.setTeams(team);
            	session.setAttribute("teams", lista);
            }

        }
		
		
		response.sendRedirect("Home");
	}

}
