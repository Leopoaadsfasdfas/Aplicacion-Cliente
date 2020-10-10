<!AQUI ES DONDE SE IMPORTAN LAS LIBRERIAS DE LAS CLASES>
<%@page import="java.util.List"%>
<%@page import="werservice.Productos"%>
<%@page import="modelo.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<link rel="stylesheet" type="text/css" href="estilos.css">   <!llamo el estilo css>
        <title>JSP Page</title>
    </head>
    <body>
<h1>Consulta Tus Productos En Linea</h1> <!-- Titulo de la pagina principal-->
        <form action="INDEX.jsp" method="post" class="form_bus">
          <div class="cont" >
        <label>Search</label>
         <!--Imput de Busqueda -->
        <input type="search" placeholder="en esta Web" title="Presione Esc para supender la búsqueda" name="entrada"> 

</div>
            
                  <form class="form">
                     
                    <%
                        String a=request.getParameter("entrada");/*texto que se extrae del input text*/
                    
      UserService user =new UserService();
List<Productos> datos=user.listar(a);/*Se manda el parametro para ser procesado y extraer los datos*/
for(Productos u:datos){/*For para traer los datos en la lista que se retorna en la clase de la consulta*/
%>         
<div id="div1">
    <!--Mandamos a mostrar los datos que se extraen de la consulta-->
                    <h1><td class='datos'>Marca <%= u.getMarca() %></h4>                                      
 <img src="<%= u.getImagen() %>" width="250" height="250">

                                 </div>
    <div id="div2">
<table>  
                                 <tr ><td class='datos'>Nombre "<%= u.getNombreProducto() %>"</td></tr>

                             <tr ><td class='datos'>Descripcion "<%= u.getDescripcionProducto() %>"</td></tr>
                            
                             <tr><td class='datos'>Existencia (<%= u.getExistencia() %>)</td></tr>
                             <tr><td class='datos'>Marca "<%= u.getMarca() %>"</td></tr>
                               <tr><td class='datos'> Precio Liquidacion. Q.<%= u.getPrecioLiquidacion() %></td></tr>
                              <tr><td class='datos'>Precio Mayoreo. Q.<%= u.getPrecioMayoreo() %></td></tr>
                              <tr><td class='datos'>Precio Oferta. Q.<%= u.getPrecioOferta() %></td></tr>
                              <tr><td class='datos'>Precio Unidad. Q.<%= u.getPrecioUnidad() %></td></tr>
                          </table>
                               </div> 
                                           <br>      
       <h3>_________________________________________________________________________________________________________________________________________</h3>
       <%}%>
      
            </form>
    </body>
</html>
