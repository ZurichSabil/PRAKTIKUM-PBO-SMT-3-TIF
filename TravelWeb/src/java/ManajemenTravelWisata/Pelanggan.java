package ManajemenTravelWisata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pelanggan implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idPelanggan;
    private String nama;
    private String email;
    private String noHp;
    private List<Pemesanan> riwayat = new ArrayList<>();

    public Pelanggan(String id, String nama, String email, String noHp) {
        this.idPelanggan = id;
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
    }

    public String getIdPelanggan() { return idPelanggan; }
    public String getNama() { return nama; }
    public String getEmail() { return email; }
    public String getNoHp() { return noHp; }
    public List<Pemesanan> getRiwayat() { return riwayat; }

    public Pemesanan buatPemesanan(PaketWisata paket, int jumlah) {
        Pemesanan p = new Pemesanan(this);
        p.tambahItem(paket, jumlah);
        riwayat.add(p);
        return p;
    }
}
