import java.util.Scanner;

public class koniecRoka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte pocet dni do konca roka (1-10): ");
        int pocetSec = sc.nextInt();

        String koncovkaSekunda = "sekunda";

        while (pocetSec > 0) {
            switch (pocetSec) {
                case 1:
                    koncovkaSekunda = " sekunda";
                    break;
                case 2:
                case 3:
                case 4:
                    koncovkaSekunda = " sekundy";
                    break;
                default:
                    koncovkaSekunda = " sekund";
                    break;
            }
            System.out.println("Do konca roka ostava " + pocetSec + koncovkaSekunda);
            pocetSec--;
        }
    }

}