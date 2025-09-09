package tugas_praktikum4;

public class Main {

    public static void main(String[] args) {
        // Buat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("Azkal", 27, "Robotics Engineer", 9000000);

        // Menampilkan informasi pekerja menggunakan metode toString()
        System.out.println("Informasi Pekerja Awal:");
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja menggunakan metode setter
        pekerja.setNama("Zurich");

        // Menampilkan ulang informasi pekerja setelah perubahan nama
        System.out.println("\nInformasi Pekerja Setelah Perubahan Nama:");
        System.out.println(pekerja.toString());
        
    }
}