package ManajemenTravelWisata;

import java.io.Serializable;

public class ItemPaket implements Serializable {
    private static final long serialVersionUID = 1L;

    private PaketWisata paket;
    private int jumlah;

    public ItemPaket(PaketWisata paket, int jumlah) {
        this.paket = paket;
        this.jumlah = jumlah;
    }

    public PaketWisata getPaket() { return paket; }
    public int getJumlah() { return jumlah; }

    public double hitungTotal() {
        return paket.getHarga() * jumlah;
    }
}
