package Controller;

import DAO.Resovle.LinhKienDAO;
import DAO.Resovle.Supplieimp;
import Model.NhacungcapEntity;
import Model.SanphamEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddnewProduct", value = "/AddnewProduct-servlet")
public class AddnewProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        Supplieimp supplieimp = new Supplieimp();
        List<NhacungcapEntity> listsuppler = supplieimp.Listsupplier();
        System.out.println("count: "+ listsuppler.size());
        req.setAttribute("listsuppler" , listsuppler);
        req.getRequestDispatcher("View/AddNewProduct.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String namepr = req.getParameter("ProductName");
        String Price = req.getParameter("Price");
        String soluong = req.getParameter("soluong");
        String idSupperli = req.getParameter("supperli");
        System.out.println(" da log vao duoc trong ham");
        SanphamEntity data = new SanphamEntity(namepr , Double.parseDouble(Price) , Double.parseDouble(soluong) , "", Integer.parseInt(idSupperli));
        LinhKienDAO linhKienDAO = new LinhKienDAO();
        boolean check = linhKienDAO.AddNewProduct(data);
        if(check) resp.sendRedirect("Menu-servlet");
        else resp.sendRedirect("AddnewProduct-servlet");
    }
}
