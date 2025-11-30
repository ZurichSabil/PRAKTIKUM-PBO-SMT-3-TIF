package ManajemenTravelWisata;

public class TransferBank implements MetodePembayaran {
    private String namaBank;
    private String noRekening;
    private String status = "MENUNGGU";

    public TransferBank(String namaBank, String noRekening) {
        this.namaBank = namaBank;
        this.noRekening = noRekening;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("\nMemproses pembayaran via Transfer Bank (" + namaBank + ")");
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Jumlah Bayar: Rp" + String.format("%,.0f", jumlah));

        status = "BERHASIL";
    }

    @Override
    public String getStatus() {
        return status;
    }
}
