package ManajemenTravelWisata.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/destinasi")
public class DestinasiServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String jenis = req.getParameter("jenis"); // domestik / internasional

        HttpSession session = req.getSession();
        session.setAttribute("jenisPaket", jenis);

        req.getRequestDispatcher("pilihPaket.jsp").forward(req, resp);
    }
}
