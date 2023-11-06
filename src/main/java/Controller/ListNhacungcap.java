package Controller;

import DAO.Resovle.Supplieimp;
import Model.NhacungcapEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListNhacungcap", value = "/ListNhacungcap-servlet")
public class ListNhacungcap extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        Supplieimp supplieimp = new Supplieimp();
        List<NhacungcapEntity> listsuppler = supplieimp.Listsupplier();
        System.out.println("count: "+ listsuppler.size());
        for (NhacungcapEntity data : listsuppler) {
            System.out.println(data.toString());
        }
        req.setAttribute("listsuppler" , listsuppler);
        req.getRequestDispatcher("View/ListNhacungcap.jsp").forward(req,resp);
    }
}
