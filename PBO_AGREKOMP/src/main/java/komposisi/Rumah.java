package komposisi;

import java.util.ArrayList;

public class Rumah {
    private ArrayList<Kamar> daftarKamar = new ArrayList<>();

    public void tambahKamar(String nama) {
        Kamar kamarBaru = new Kamar(nama);
        daftarKamar.add(kamarBaru);
    }

    public void tampilkanKamar() {
        System.out.println("Daftar Kamar di Rumah:");
        for (Kamar k : daftarKamar) {
            System.out.println("- " + k.getNama());
        }
    }
}
