package agregasi;

import java.util.ArrayList;

public class Dosen {
    private String nama;
    private ArrayList<Mahasiswa> bimbingan = new ArrayList<>();

    public Dosen(String nama) {
        this.nama = nama;
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        bimbingan.add(mhs);
    }

    public void tampilkanBimbingan() {
        System.out.println("Mahasiswa bimbingan " + nama + ":");
        for (Mahasiswa m : bimbingan) {
            System.out.println("- " + m.getNama());
        }
    }
}
