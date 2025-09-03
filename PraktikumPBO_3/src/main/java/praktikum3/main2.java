package praktikum3;

public class main2 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Mersedes", "Suzuki", 2020, "hitam");
        Mobil mobil2 = new Mobil("Honda", "Wuling", 2021, "putih");

        mobil1.displayInfo();
        mobil1.startEngine();
        mobil1.ubahWarna("Merah");
        mobil1.displayInfo();
        
        mobil2.displayInfo();
        mobil2.startEngine();
        mobil2.ubahWarna("Biru");
        mobil2.displayInfo();
    }
}