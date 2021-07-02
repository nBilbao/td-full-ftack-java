package com.simple.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Probar funcionamiento con http://localhost:8080/SimpleProject/Home?name=nemesio%20bilbao&lang=Spanish&home=Loncoche

/**
 * Implementación del servlet de la clase Home
 */
@WebServlet("/Home")
public class SimpleProject extends HttpServlet {
    private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
 // ...
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los valores para los parámetros de consulta
        String userName = request.getParameter("name");
        String language = request.getParameter("lang");
        String hometown = request.getParameter("home");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome, " + userName + "</h1>");
        out.write("<h2>Your favorite language is: " + language + "</h2>");
        out.write("<h2>Your hometown is: " + hometown + "</h2>");
    }

// ...

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
    