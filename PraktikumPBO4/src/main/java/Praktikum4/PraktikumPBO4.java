package Praktikum4;

public class PraktikumPBO4 {

    public static void main(String[] args) {
        // Membuat objek dari kelas kendaraan
        Kendaraan Sasa = new Kendaraan("Toyota Avanza", 500, "Bensin");
        // Menampilkan informasi kendaraan menggunakan metode tampilkanInfoKendaraan
        Sasa.tampilkanInfoKendaraan();

        // Membuat objek dari kelas mobil
        mobil Bilbil = new mobil("Range Rover", 600, "Electric Vehicle", 4);
        Bilbil.tampilkanInfoMobil();
    }
}