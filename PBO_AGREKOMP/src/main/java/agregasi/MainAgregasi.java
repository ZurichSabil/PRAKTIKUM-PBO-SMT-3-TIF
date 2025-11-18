package agregasi;

public class MainAgregasi {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("Naeva");
        Mahasiswa m2 = new Mahasiswa("Lerian");
        Mahasiswa m3 = new Mahasiswa("Fady");

        Dosen dosen = new Dosen("Yusuf");

        dosen.tambahMahasiswa(m1);
        dosen.tambahMahasiswa(m2);
        dosen.tambahMahasiswa(m3);

        dosen.tampilkanBimbingan();
    }
}
