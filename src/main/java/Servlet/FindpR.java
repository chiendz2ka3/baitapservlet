package Servlet;

import DAO.Resovle.Productipl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "FindpR", value = "/FindpR-servlet")
public class FindpR extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);
        String datafind = req.getParameter("namepr");
        if(datafind == "") {
            resp.sendRedirect("ManagerList-servlet");
            return;
        }
        Productipl productipl = new Productipl();
        productipl.FindProduct(datafind);
        req.setAttribute("listsanpham", productipl.FindProduct(datafind));
        System.out.println(productipl.FindProduct(datafind).size());
        req.getRequestDispatcher("/View/dsProduct.jsp").forward(req,resp);
    }
}
