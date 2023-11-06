package Controller;

import DAO.Resovle.LinhKienDAO;
import Model.SanphamEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ManagerList", value = "/ManagerList-servlet")
public class ManagerList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        LinhKienDAO linhKienDAO = new LinhKienDAO();
        List<SanphamEntity> listsanpham = linhKienDAO.ListProduct();
        System.out.println("count: "+ listsanpham.size());
        req.setAttribute("listsanpham", listsanpham);
        req.getRequestDispatcher("/View/dsProduct.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }
}
