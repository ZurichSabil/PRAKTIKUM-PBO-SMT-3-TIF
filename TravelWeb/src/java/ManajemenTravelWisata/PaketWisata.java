package ManajemenTravelWisata;

import java.io.Serializable;

public class PaketWisata implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idPaket;
    private String namaPaket;
    private double harga;
    private int durasi;
    private int kuota;

    public PaketWisata(String idPaket, String namaPaket, double harga, int durasi, int kuota) {
        this.idPaket = idPaket;
        this.namaPaket = namaPaket;
        setHarga(harga);
        setDurasi(durasi);
        setKuota(kuota);
    }

    public String getIdPaket() { return idPaket; }
    public String getNamaPaket() { return namaPaket; }
    public double getHarga() { return harga; }
    public int getDurasi() { return durasi; }
    public int getKuota() { return kuota; }

    public void setHarga(double harga) {
        if (harga < 0) throw new IllegalArgumentException("Harga tidak boleh negatif.");
        this.harga = harga;
    }

    public void setDurasi(int durasi) {
        if (durasi <= 0) throw new IllegalArgumentException("Durasi harus lebih dari 0.");
        this.durasi = durasi;
    }

    public void setKuota(int kuota) {
        if (kuota < 0) throw new IllegalArgumentException("Kuota tidak boleh negatif.");
        this.kuota = kuota;
    }

    public boolean cekKuota(int jumlah) {
        return kuota >= jumlah;
    }

    public void kurangiKuota(int jumlah) {
        if (!cekKuota(jumlah)) throw new IllegalArgumentException("Kuota tidak mencukupi.");
        this.kuota -= jumlah;
    }

    public String tampilkanInfo() {
        return "Paket: " + namaPaket +
                "\nDurasi: " + durasi + " hari" +
                "\nHarga: Rp" + harga +
                "\nKuota tersisa: " + kuota;
    }
}
