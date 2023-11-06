package Controller;

import DAO.Resovle.Supplieimp;
import Model.NhacungcapEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Supperlicontrol", value = "/Supperlicontrol-servlet")
public class Supperlicontrol extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("anh chien dz");
        req.getRequestDispatcher("View/AddnewSupperli.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String SupplierName = req.getParameter("SupplierName");
        String Address = req.getParameter("Address");
        String PhoneNumber = req.getParameter("sdt");
        System.out.println(SupplierName+ " , "+ Address +", "+ PhoneNumber);
        if(SupplierName.isEmpty() || Address.isEmpty() || PhoneNumber.isEmpty()) {
            resp.sendRedirect("Supperlicontrol-servlet");
            return;
        }
        Supplieimp supplieimp = new Supplieimp();
        NhacungcapEntity data = new NhacungcapEntity(SupplierName , Address , PhoneNumber);
        boolean check = supplieimp.Addnewsupplier(data);
        if(check) resp.sendRedirect("Menu-servlet");
        else resp.sendRedirect("Supperlicontrol-servlet");
    }
}
