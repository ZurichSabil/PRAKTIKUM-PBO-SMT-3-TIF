<!DOCTYPE html>
<html>
<head>
    <title>Pilih Metode Pembayaran</title>
</head>
<body>

<h2>Pilih Metode Pembayaran</h2>

<form action="metodePembayaran" method="post">

    <label>
        <input type="radio" name="metode" value="bank" required> Transfer Bank
    </label><br>

    <label>
        <input type="radio" name="metode" value="ewallet" required> E-Wallet
    </label><br><br>

    <button type="submit">Lanjut</button>

</form>

</body>
</html>
