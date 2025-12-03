package ManajemenTravelWisata.controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pembayaran")
public class PembayaranServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String jenisPaket = request.getParameter("jenisPaket");
        String paket = request.getParameter("paket");
        String jumlah = request.getParameter("jumlah");

        out.println("<html><body>");
        out.println("<h2>Pilih Metode Pembayaran</h2>");

        out.println("<form action='proses-pembayaran' method='POST'>");

        // Bawa semua data ke servlet berikutnya
        out.println("<input type='hidden' name='jenisPaket' value='" + jenisPaket + "'>");
        out.println("<input type='hidden' name='paket' value='" + paket + "'>");
        out.println("<input type='hidden' name='jumlah' value='" + jumlah + "'>");

        out.println("<label>Metode Pembayaran:</label><br>");
        out.println("<input type='radio' name='metode' value='bank' required> Transfer Bank<br>");
        out.println("<input type='radio' name='metode' value='ewallet'> E-Wallet<br><br>");

        out.println("<button type='submit'>Lanjut</button>");
        out.println("</form>");

        out.println("</body></html>");
    }
}
