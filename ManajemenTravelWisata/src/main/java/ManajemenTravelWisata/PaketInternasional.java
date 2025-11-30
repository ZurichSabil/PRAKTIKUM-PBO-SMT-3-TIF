package ManajemenTravelWisata;

public class PaketInternasional extends PaketWisata {

    private String negara;
    private boolean visa;

    public PaketInternasional(String idPaket, String namaPaket, double harga, int durasi, int kuota,
                              String negara, boolean visa) {
        super(idPaket, namaPaket, harga, durasi, kuota);
        this.negara = negara;
        this.visa = visa;
    }

    public String getNegara() {
        return negara;
    }

    public boolean isVisa() {
        return visa;
    }
}
