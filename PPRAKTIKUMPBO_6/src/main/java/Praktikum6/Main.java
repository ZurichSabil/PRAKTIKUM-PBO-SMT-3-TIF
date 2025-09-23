package Praktikum6;

public class Main {
    public static void main(String[] args) {
        Hewan kelly = new Kucing();
        kelly.bersuara();

        Kucing kucing = new Kucing();
        kucing.makan("ikan");         // Memanggil method makan() dari kelas Hewan
        kucing.makan("ikan", 3);      // Memanggil versi method makan() dengan parameter tambahan (overloaded) dari kelas Hewan

        Anjing anjing = new Anjing();
        anjing.bersuara();            // Memanggil method bersuara() dari kelas Anjing yang menghasilkan output "Guk-guk"
        anjing.makan("daging", 3);    // Memanggil versi method makan() yang sudah dioverload pada kelas Hewan
    }
}
