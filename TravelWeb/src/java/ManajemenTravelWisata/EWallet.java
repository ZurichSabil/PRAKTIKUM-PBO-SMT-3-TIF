package ManajemenTravelWisata;

public class EWallet implements MetodePembayaran {
    private String provider;
    private String nomor;
    private String status = "MENUNGGU";

    public EWallet(String provider, String nomor) {
        this.provider = provider;
        this.nomor = nomor;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("\nMemproses pembayaran via E-Wallet (" + provider + ")");
        System.out.println("Nomor Akun : " + nomor);
        System.out.println("Jumlah Bayar: Rp" + String.format("%,.0f", jumlah));

        status = "BERHASIL";
    }

    @Override
    public String getStatus() {
        return status;
    }
}
