package ManajemenTravelWisata.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/pelanggan")
public class PelangganServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Ambil data dari form pelanggan.jsp
        String nama = req.getParameter("nama");
        String email = req.getParameter("email");
        String hp = req.getParameter("hp");

        // Simpan ke session
        HttpSession session = req.getSession();
        session.setAttribute("nama", nama);
        session.setAttribute("email", email);
        session.setAttribute("hp", hp);

        // Arahkan ke halaman pilih destinasi
        req.getRequestDispatcher("pilihDestinasi.jsp").forward(req, resp);
    }
}
