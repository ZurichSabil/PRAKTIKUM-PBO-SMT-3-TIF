package TugasPraktikum5;

public class HewanDarat extends Hewan {
    String habitat;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Habitat hewan ini ada di : " + habitat);
    }
}