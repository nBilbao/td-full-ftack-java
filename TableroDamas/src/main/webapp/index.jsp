<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
        <link rel="stylesheet" href="/TableroDamas/style.css" />
    </head>
<body>
    <!-- Obtenemos el valor del parámetro name -->
    <% String w = request.getParameter("width"); %>
    <% String h = request.getParameter("heigth"); %>
    <% int ww = Integer.parseInt(w); %>
    <% int hh = Integer.parseInt(h);
       int contadorColor = 0;%>
    <!-- Mostramos el valor que obtuvimos -->
    <h1>WIDTH: <%= w %> HEIGTH: <%= h %></h1>
    
    <% for(int i = 0; i < hh; i++) { %>
    <br>
    	<% for(int j = 0; j < ww; j++) { 
    		if(contadorColor%2==0){%>
    			<div class="color1"></div>
    		<% }
    		else{%>
    		
        		<div></div>
        		<%} %>
    <%contadorColor++; } %>
    <%if(hh<10){
    	contadorColor++;
    }
   
    
    }%>
    
</body>
</html>