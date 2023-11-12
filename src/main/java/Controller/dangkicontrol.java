package Controller;

import DAO.Resovle.LoginDAO;
import Model.UsersEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "dangkicontrol", value = "/dangkicontrol-servlet")
public class dangkicontrol extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        req.getRequestDispatcher("View/GDDangKi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);
        try {
            String username = req.getParameter("UserName");
            String Email = req.getParameter("Email");
            String sdt = req.getParameter("sdt");
            String password = req.getParameter("password");
            String repassword = req.getParameter("repassword");
            System.out.println(username+" , "+ Email +", "+ sdt+", "+ password);
            if(username.isEmpty()  || Email.isEmpty()|| sdt.isEmpty() || password.isEmpty()){
                System.out.println("chac chan la null r ");
                resp.sendRedirect("dangkicontrol-servlet");
                return;
            }
            if(!password.equals(repassword)){
                System.out.println(" chac chan la khac password r");
                resp.sendRedirect("dangkicontrol-servlet");
                return;
            }

            LoginDAO login = new LoginDAO();
            UsersEntity data = new UsersEntity(username , password , sdt , Email);

            boolean check = login.RegisterUser(data);
            if(check) resp.sendRedirect("DangNhap-servlet");
            else resp.sendRedirect("dangkicontrol-servlet");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
