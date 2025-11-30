/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenTravelWisata;

/**
 *
 * @author zara
 */
// KELAS INDUK
public class PaketWisata {
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
    
    // Getter
    public String getIdPaket() { return idPaket; }
    public String getNamaPaket() { return namaPaket; }
    public double getHarga() { return harga; }
    public int getDurasi() { return durasi; }
    public int getKuota() { return kuota; }

    // Setter
    public void setHarga(double harga) {
        if (harga < 0) throw new IllegalArgumentException("Harga tidak boleh negatif.");
        this.harga = harga;
    }

    public void setDurasi(int durasi) {
        if (durasi <= 0) throw new IllegalArgumentException("Durasi harus lebih dari 0 hari.");
        this.durasi = durasi;
    }
    
    public void setKuota(int kuota) {
        if (kuota < 0) throw new IllegalArgumentException("Kuota tidak boleh negatif.");
        this.kuota = kuota;
    }

    // Logic
    public boolean cekKuota(int jumlah) {
        return kuota >= jumlah;
    }

    public void reduceKuota(int jumlah) {
        if (!cekKuota(jumlah))throw new IllegalArgumentException("Kuota tidak mencukupi.");
        this.kuota -= jumlah;
    }

    public String tampilkanInfo() {
        return """
        Paket: %s
        Durasi: %d hari
        Harga: Rp%.2f
        Kuota tersisa: %d
        """.formatted(namaPaket, durasi, harga, kuota);
    }
}

// KELAS TURUNAN 1 : PAKET DOMESTIK
class PaketDomestik extends PaketWisata {
    private String region;

    public PaketDomestik(String id, String nama, double harga, int durasi, int kuota, String region) {
        super(id, nama, harga, durasi, kuota);
        this.region = region;
    }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "Region: " + region + "\n";
    }
}

// KELAS TURUNAN 2 : PAKET INTERNASIONAL
public class PaketInternasional extends PaketWisata {
    private String negaraTujuan;
    private boolean butuhVisa;

    public PaketInternasional(String id, String nama, double harga, int durasi, int kuota, String negaraTujuan, boolean butuhVisa) {
        super(id, nama, harga, durasi, kuota);
        this.negaraTujuan = negaraTujuan;
        this.butuhVisa = butuhVisa;
    }

    public String getNegaraTujuan() { return negaraTujuan; }
    public boolean isButuhVisa() { return butuhVisa; }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + "Negara: " + negaraTujuan +"\nButuh Visa: " + (butuhVisa ? "Ya" : "Tidak") + "\n";
    }
}

// KELAS ITEM PAKET (Menampung banyak item di kelas Pemesanan)
class ItemPaket {
    private PaketWisata paket;
    private int jumlah;

    public ItemPaket(PaketWisata paket, int jumlah) {
        this.paket = paket;
        this.jumlah = jumlah;
    }

    public PaketWisata getPaket() { return paket; }
    public int getJumlah() { return jumlah; }

    public double hargaTotal() {
        return paket.getHarga() * jumlah;
    }
}
