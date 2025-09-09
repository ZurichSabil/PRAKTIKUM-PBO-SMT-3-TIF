package Praktikum4;

public class mobil extends Kendaraan {
    private int jumlahPintu; //Atribut tambahan khusus untuk mobil

    // Konstruktor
    public mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMaks karena protected
        System.out.println("\nNama Kendaraan : " + nama);
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println("Jumlah Pintu " + jumlahPintu);
    }
}