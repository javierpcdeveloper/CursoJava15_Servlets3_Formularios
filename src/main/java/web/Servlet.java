package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletFormularios")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
        doGet(req,res);
    }
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out=res.getWriter();
        String usuario=req.getParameter("usuario");
        String clave=req.getParameter("clave");
        String tecnologia[]=req.getParameterValues("tecnologia");
        String genero=req.getParameter("genero");
        String ocupacion=req.getParameter("ocupacion");
        String[] intereses=req.getParameterValues("intereses");
        String comentarios=req.getParameter("comentarios");
        out.print("<html><head><title>Resultado servlet</title></head><body><h1>Datos</h1>");
        out.print("<table border='1'><tr><td>Usuario</td><td>"+usuario+"</td></tr>");
        out.print("<tr><td>Contraseña</td><td>"+clave+"</td></tr>");
        out.print("<tr><td>Género</td><td>"+genero+"</td></tr>");
        out.print("<tr><td>Tecnologías:</td><td>");
        for(String tec:tecnologia){
            out.print(tec+"<br>");
        }
        out.print("</td></tr>");
        out.print("<tr><td>Ocupación</td><td>"+ocupacion+"</td></tr>");
        out.print("<tr><td>Intereses</td><td>");
        for(String inte:intereses){
            out.print(inte+"<br>");
        }
        out.print("</td></tr><tr><td>Comntarios</td><td>"+comentarios+"</td></tr>");
        out.print("</table></body></html>");
        //out.print("Usuario: "+usuario+"<br>Clave: "+clave+"<br>Género: "+genero+".</body></html>");
    }
}