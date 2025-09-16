package TugasPraktikum5;


public class Kucing extends HewanDarat {
    String suarakucing;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Kucing : " + suarakucing);
    }
}