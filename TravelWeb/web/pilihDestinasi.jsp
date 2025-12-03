<%@ page import="java.util.List" %>
<%@ page import="ManajemenTravelWisata.PaketWisata" %>

<!DOCTYPE html>
<html>
<head>
    <title>Pilih Destinasi</title>
</head>
<body>

<h2>Pilih Destinasi Paket</h2>

<form action="pilihDestinasi" method="post">

    <%  
        List<PaketWisata> list = (List<PaketWisata>) request.getAttribute("daftarPaket");
        for (PaketWisata p : list) {
    %>
        <label>
            <input type="radio" name="destinasi" value="<%= p.getIdPaket() %>" required>
            <%= p.getNamaPaket() %> - Rp <%= p.getHarga() %>
        </label><br>
    <% } %>

    <br>
    <button type="submit">Lanjut</button>
</form>

</body>
</html>
