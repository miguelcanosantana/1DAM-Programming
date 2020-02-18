<%-- 
    Document   : program
    Created on : 17 feb. 2020, 10:54:18
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
        <h1>Results!</h1>
        
        <!--Java Code-->
        <% 
          /*Need to do this always to recognize other types of characters*/
          request.setCharacterEncoding("UTF-8");
          
          String selectedCup = request.getParameter("cups");
          int randomCupNum = (int)(Math.random()*3 + 1);
          String randomCupName = null;
          
          //Numbers to Names Cups
          if (randomCupNum == 1) {
            randomCupName = "left";
          }
          
          if (randomCupNum == 2) {
            randomCupName = "center";
          }
          
          if (randomCupNum == 3) {
            randomCupName = "right";
          }
          
          //Compare and show
          if (randomCupName.equals(request.getParameter("cups"))){
            
          } else {
          
          }
          
          if 
          <img src="img/hidden.png" alt="...">
          <img src="img/hidden.png" alt="...">
          <img src="img/hidden.png" alt="...">


        
        %>
    </body>
</html>
