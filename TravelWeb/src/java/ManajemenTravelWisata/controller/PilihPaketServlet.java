package ManajemenTravelWisata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pilih-paket")
public class PilihPaketServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String jenisPaket = request.getParameter("jenisPaket");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Pilih Paket</title>");

        // === CSS SAMA 100% DENGAN INDEX ===
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background: #f0f3f7; margin: 0; padding: 0; }");
        out.println(".container { width: 420px; margin: 60px auto; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 0 15px #00000020; }");
        out.println("h2 { text-align: center; margin-bottom: 25px; color: #2c3e50; }");
        out.println("label { font-weight: bold; display: block; margin-bottom: 6px; }");
        out.println("input, select { width: 100%; padding: 10px; margin-bottom: 20px; border-radius: 6px; border: 1px solid #bbb; font-size: 15px; }");
        out.println("button { width: 100%; padding: 12px; background: #3498db; color: white; border: none; border-radius: 6px; font-size: 17px; cursor: pointer; font-weight: bold; }");
        out.println("button:hover { background: #2980b9; }");
        out.println("</style>");

        // === VALIDASI JAVASCRIPT ===
        out.println("<script>");
        out.println("function validateForm() {");
        out.println("  let jumlah = document.forms['paketForm']['jumlah'].value;");
        out.println("  if (jumlah === '' || jumlah <= 0) { alert('Jumlah orang tidak boleh kosong!'); return false; }");
        out.println("  return true;");
        out.println("}");
        out.println("</script>");

        out.println("</head>");
        out.println("<body>");

        out.println("<div class='container'>");
        out.println("<h2>Pilih Paket " + (jenisPaket.equals("domestik") ? "Domestik" : "Internasional") + "</h2>");

        out.println("<form name='paketForm' action='konfirmasi-paket' method='POST' onsubmit='return validateForm()'>");

        out.println("<input type='hidden' name='jenisPaket' value='" + jenisPaket + "'>");

        // === Dropdown Paket ===
        if (jenisPaket.equals("domestik")) {
            out.println("<label>Pilih Kota</label>");
            out.println("<select name='paket' required>");
            out.println("<option value=''>-- Pilih Kota --</option>");
            out.println("<option value='Bali'>Bali</option>");
            out.println("<option value='Solo'>Solo</option>");
            out.println("<option value='Yogyakarta'>Yogyakarta</option>");
            out.println("<option value='Raja Ampat'>Raja Ampat</option>");
            out.println("<option value='Sumba'>Sumba</option>");
            out.println("</select>");
        } else {
            out.println("<label>Pilih Negara</label>");
            out.println("<select name='paket' required>");
            out.println("<option value=''>-- Pilih Negara --</option>");
            out.println("<option value='Singapura'>Singapura</option>");
            out.println("<option value='Malaysia'>Malaysia</option>");
            out.println("<option value='Thailand'>Thailand</option>");
            out.println("<option value='Korea Selatan'>Korea Selatan</option>");
            out.println("<option value='Jepang'>Jepang</option>");
            out.println("</select>");
        }

        // jumlah orang
        out.println("<label>Jumlah Orang</label>");
        out.println("<input type='number' name='jumlah' min='1' placeholder='Masukkan jumlah orang' required>");

        out.println("<button type='submit'>Lanjut</button>");
        out.println("</form>");

        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
