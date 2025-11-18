package komposisi;

public class MainKomposisi {
    public static void main(String[] args) {

        Rumah rumahSaya = new Rumah();
        rumahSaya.tambahKamar("Kamar Tidur Utama");
        rumahSaya.tambahKamar("Kamar Tidur Anak");
        rumahSaya.tambahKamar("Kamar Mandi");

        rumahSaya.tampilkanKamar();
    }
}
