package praktikum3;

public class main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        
        Hewan kapibara = new Hewan("Masbro", 3);
        kapibara.berlari();
        kapibara.info();
    }
}