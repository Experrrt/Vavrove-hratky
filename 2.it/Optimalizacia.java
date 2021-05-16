import java.util.Scanner;

public class Optimalizacia {
    Scanner scan = new Scanner(System.in);
    float cislo;
    float premeneneMM;
    float vysledok;
    String jednotka;

    public void Premena() {
        switch (jednotka) {
        case "cm":
            premeneneMM = cislo * 10;
            break;

        case "km":
            premeneneMM = cislo * 1000000;
            break;

        case "dm":
            premeneneMM = cislo * 100;
            break;

        case "m":
            premeneneMM = cislo * 1000;
            break;

        case "mm":
            premeneneMM = cislo * 1;
            break;
        }
    }

    public void Kalkulacka() {

        System.out.print("Zadaj cislo: ");
        cislo = scan.nextFloat();
        jednotka = scan.next();
        Premena();
        float vysledok1 = premeneneMM;

        System.out.print("Zadaj cislo: ");
        cislo = scan.nextFloat();
        jednotka = scan.next();
        Premena();
        float vysledok2 = premeneneMM;

        scan.nextLine();
        System.out.print("zadaj plus alebo minus: ");
        char znamienko = scan.nextLine().charAt(0);

        switch (znamienko) {
        case '+':
            vysledok = vysledok1 + vysledok2;
            break;
        case '-':
            vysledok = vysledok1 - vysledok2;
            break;
        }
        System.out.println(vysledok);
    }

    public static void main(String[] args) {
        Optimalizacia k = new Optimalizacia();
        k.Kalkulacka();
    }
}