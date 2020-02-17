<%-- 
    Document   : program
    Created on : 17 feb. 2020, 10:00:27
    Author     : migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your ideal car</h1>
        
        <!--Java Code-->
        <% 
          String skinColour = request.getParameter("colours");
          String material = request.getParameter("material");
          
          String photo = ("img/" + skinColour + material + ".jpg");     
          boolean go = true;
          
          /*Need to do this always to recognize other types of characters*/
          request.setCharacterEncoding("UTF-8");
          
          out.println (photo);
        
        %>
        
        <img src= "<%= photo %>">
    </body>
</html>
