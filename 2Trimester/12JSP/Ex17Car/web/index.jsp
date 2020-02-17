<%-- 
    Document   : index
    Created on : 17 feb. 2020, 9:03:45
    Author     : migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Car selector</title>
    </head>
    <body>
        
        <h1>Select your custom new car:</h1>
        
        <!--Every select and option must be inside the form, also submit-->
        <form method="post" action="program.jsp">
            
            <select name="colours">
              <option value="negro" selected>Black</option>
              <option value="blanco">White</option>
              <option value="berengena">Eggplant</option>
            </select>

            <select name="material">
              <option value="carbono" selected>Carbon</option>
              <option value="madera">Wooden</option>         
            </select>

            <input type="submit" value="See it!">
                    
            
        </form>
        
    </body>
</html>
