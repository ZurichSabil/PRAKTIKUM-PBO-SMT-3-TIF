package TugasPraktikum5;

public class Anjing extends HewanDarat {
    String suaraanjiang;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Anjing : " + suaraanjiang);
    }
}