package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import werservice.Productos;
import modelo.UserService;

public final class INDEX_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!AQUI ES DONDE SE IMPORTAN LAS LIBRERIAS DE LAS CLASES>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    \t<link rel=\"stylesheet\" type=\"text/css\" href=\"estilos.css\">   <!llamo el estilo css>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<h1>Consulta Tus Productos En Linea</h1> <!-- Titulo de la pagina principal-->\n");
      out.write("        <form action=\"INDEX.jsp\" method=\"post\" class=\"form_bus\">\n");
      out.write("          <div class=\"cont\" >\n");
      out.write("        <label>Search</label>\n");
      out.write("         <!--Imput de Busqueda -->\n");
      out.write("        <input type=\"search\" placeholder=\"en esta Web\" title=\"Presione Esc para supender la búsqueda\" name=\"entrada\"> \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("                  <form class=\"form\">\n");
      out.write("                     \n");
      out.write("                    ");

                        String a=request.getParameter("entrada");/*texto que se extrae del input text*/
                    
      UserService user =new UserService();
List<Productos> datos=user.listar(a);/*Se manda el parametro para ser procesado y extraer los datos*/
for(Productos u:datos){/*For para traer los datos en la lista que se retorna en la clase de la consulta*/

      out.write("         \n");
      out.write("<div id=\"div1\">\n");
      out.write("    <!--Mandamos a mostrar los datos que se extraen de la consulta-->\n");
      out.write("                    <h1><td class='datos'>Marca ");
      out.print( u.getMarca() );
      out.write("</h4>                                      \n");
      out.write(" <img src=\"");
      out.print( u.getImagen() );
      out.write("\" width=\"250\" height=\"250\">\n");
      out.write("\n");
      out.write("                                 </div>\n");
      out.write("    <div id=\"div2\">\n");
      out.write("<table>  \n");
      out.write("                                 <tr ><td class='datos'>Nombre \"");
      out.print( u.getNombreProducto() );
      out.write("\"</td></tr>\n");
      out.write("\n");
      out.write("                             <tr ><td class='datos'>Descripcion \"");
      out.print( u.getDescripcionProducto() );
      out.write("\"</td></tr>\n");
      out.write("                            \n");
      out.write("                             <tr><td class='datos'>Existencia (");
      out.print( u.getExistencia() );
      out.write(")</td></tr>\n");
      out.write("                             <tr><td class='datos'>Marca \"");
      out.print( u.getMarca() );
      out.write("\"</td></tr>\n");
      out.write("                               <tr><td class='datos'> Precio Liquidacion. Q.");
      out.print( u.getPrecioLiquidacion() );
      out.write("</td></tr>\n");
      out.write("                              <tr><td class='datos'>Precio Mayoreo. Q.");
      out.print( u.getPrecioMayoreo() );
      out.write("</td></tr>\n");
      out.write("                              <tr><td class='datos'>Precio Oferta. Q.");
      out.print( u.getPrecioOferta() );
      out.write("</td></tr>\n");
      out.write("                              <tr><td class='datos'>Precio Unidad. Q.");
      out.print( u.getPrecioUnidad() );
      out.write("</td></tr>\n");
      out.write("                          </table>\n");
      out.write("                               </div> \n");
      out.write("                                           <br>      \n");
      out.write("       <h3>_________________________________________________________________________________________________________________________________________</h3>\n");
      out.write("       ");
}
      out.write("\n");
      out.write("      \n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
