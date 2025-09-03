package praktikum3;

public class Mobil {
    String merk;
    String model;
    int tahun;
    String Warna;

public Mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
}
public String getMerk() {
    return merk;
}

public void setMerk(String merk) {
    this.merk = merk;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public int getTahun() {
    return tahun;
}

public void setTahun(int tahun) {
    this.tahun = tahun;
}

public void displayInfo() {
    System.out.println("Merk mobil tersebut adalah " + merk + " dengan Model " + model + 
                       " dan keluaran tahun " + tahun);
}
public void startEngine() {
    System.out.println("Mesin mobil " + merk + " menyala");
}
public void ubahWarna(String warnaBaru) {
    this.Warna = warnaBaru;
    System.out.println("Warna mobil diubah menjadi " + warnaBaru);
}
}