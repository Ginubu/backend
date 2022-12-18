<%-- 
    Document   : index
    Created on : 12 dic. 2022, 12:24:27
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario</h1>
        <form action="SvPersona" method="POST">
            <p><label>DNI: </label> <input type="text" name="dni"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>apellido: </label> <input type="text" name="apellido"></p>
            <button type="submit">Enviar </button>
        </form>
        
        <h1> Ver personas</h1>
        <p> para ver clikear en mostrar personas </p>
        <form action=" " method=" ">
            <button type="submit"> mostrar personas</button>
        </form> 
         
        <p>Ingrese dni de la persona a eliminar</p>
        <form action=" " method=" ">
            <p><label>DNI: </label> <input type="text" name="dni_elim"></p>
            <button type="submit">Eliminar</button>
        </form>
    </body>
</html>

