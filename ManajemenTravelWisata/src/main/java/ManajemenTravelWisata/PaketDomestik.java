package ManajemenTravelWisata;

public class PaketDomestik extends PaketWisata {

    private String lokasi;
    private boolean includeHotel;

    public PaketDomestik(String idPaket, String namaPaket, double harga, int durasi, int kuota,
                         String lokasi, boolean includeHotel) {
        super(idPaket, namaPaket, harga, durasi, kuota);
        this.lokasi = lokasi;
        this.includeHotel = includeHotel;
    }

    public String getLokasi() {
        return lokasi;
    }

    public boolean isIncludeHotel() {
        return includeHotel;
    }
}
