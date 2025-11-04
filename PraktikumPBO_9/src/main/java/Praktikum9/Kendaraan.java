package Praktikum9;

//Definisi kelas abstrak
abstract class Kendaraan {
    //Metode abstrak
    abstract void berjalan();

    //metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}