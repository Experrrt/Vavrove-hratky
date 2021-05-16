public class Auto {
    String farba;
    int pocetDveri;
    String znacka;
    int maxRychlost;
    int vykon;
    int pocetOkien;
    int pocetKolies;
    int aktualanRychlost;

    public void zastav(int rychlost) {
        this.aktualanRychlost = rychlost;
        System.out.println("Auto zastavilo...");
    }

    public void zrychli(int rychlost) {
        this.aktualanRychlost += rychlost;
        System.out.println("Auto zrychlilo...");
    }

    public void spomal(int rychlost) {
        this.aktualanRychlost -= rychlost;
        System.out.println("Auto spomalilo...");
    }

    public void nastartuj() {
        System.out.println("Auto znacky " + this.znacka + " nastartovane... ");
    }

    public static void main(String[] args) {
    }
}
