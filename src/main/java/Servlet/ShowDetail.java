package Servlet;

import DAO.Resovle.Productipl;
import Entities.SanphamEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "ShowDetail", value = "/ShowDetail-servlet")
public class ShowDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
          int id = Integer.parseInt(req.getParameter("sid"));
          Productipl productipl = new Productipl();
          SanphamEntity data = productipl.finpr(id);
          req.setAttribute("data" , data);
          System.out.println(data.toString());
          req.getRequestDispatcher("View/ShowDetail.jsp").forward(req,resp);
    }
}
