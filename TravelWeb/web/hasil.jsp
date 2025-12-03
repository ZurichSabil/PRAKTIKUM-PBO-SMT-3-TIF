<%@ page import="ManajemenTravelWisata.PaketWisata" %>

<!DOCTYPE html>
<html>
<head>
    <title>Hasil Transaksi</title>
</head>
<body>

<h2>Pembayaran Berhasil!</h2>

<p><b>Nama:</b> <%= request.getAttribute("nama") %></p>
<p><b>Email:</b> <%= request.getAttribute("email") %></p>
<p><b>HP:</b> <%= request.getAttribute("hp") %></p>

<hr>

<p><b>Paket:</b> <%= request.getAttribute("namaPaket") %></p>
<p><b>Jumlah Orang:</b> <%= request.getAttribute("jumlahOrang") %></p>
<p><b>Total Bayar:</b> Rp <%= request.getAttribute("total") %></p>

<hr>

<p><b>Metode:</b> <%= request.getAttribute("metode") %></p>
<p><b>Detail Pembayaran:</b> <%= request.getAttribute("detail") %></p>

</body>
</html>
