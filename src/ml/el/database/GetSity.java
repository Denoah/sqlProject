package ml.el.database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetSity")
public class GetSity extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        DBconnector dBconnector = new DBconnector();
        String parametr = request.getParameter("data");
        if (parametr == null) {
            String query = "SELECT name FROM sity";
            response.getWriter().write(dBconnector.setQuery(query));
        } else {
            String query = "INSERT INTO sity (name) VALUES ('" + parametr + "');";
            response.getWriter().write(dBconnector.setInsertQuery(query));
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("getSity");
    }
}
