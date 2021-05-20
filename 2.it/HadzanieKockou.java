import java.util.*;

public class HadzanieKockou {

    public static int[] generujKocky(int pocetKociek) {
        int[] hodyKocky = new int[pocetKociek];
        Random rnd = new Random();

        for (int i = 0; i < pocetKociek; i++) {
            hodyKocky[i] = rnd.nextInt(6) + 1;
        }
        return hodyKocky;
    }

    public static String generujRetazecHodov(int[] hodyKocky) {
        String retazecHodovKocky = "";

        for (int i = 0; i < hodyKocky.length; i++) {
            retazecHodovKocky += hodyKocky[i] + " ";
        }
        return retazecHodovKocky;
    }

    public static int spocitajKocky(int[] hodyKocky) {
        int sucetKociek = 0;

        for (int i = 0; i < hodyKocky.length; i++) {
            sucetKociek += hodyKocky[i];
        }
        return sucetKociek;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte počet kociek: ");
        int pocetHodov = sc.nextInt();

        int[] hodyKocky = generujKocky(pocetHodov);
        System.out.println("Hodil si: " + generujRetazecHodov(hodyKocky));
        System.out.println("Súčet hodov: " + spocitajKocky(hodyKocky));
    }
}
