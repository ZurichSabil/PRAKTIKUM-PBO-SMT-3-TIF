package Responsi;

public class PegawaiTetap extends Pegawai {
    private int tunjangan;
    public PegawaiTetap() {}

    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    public int getTunjangan() {
        return tunjangan;
    }
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
