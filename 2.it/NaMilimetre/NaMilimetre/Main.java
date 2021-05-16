import java.util.Scanner;

public class Main {

    public float naMilimetre(String jednotka, float cislo) {
        float nasobitel = 0;

        switch (jednotka) {

        case "km":
            nasobitel = cislo * 1000000;
            break;
        case "m":
            nasobitel = cislo * 1000;
            break;
        case "dm":
            nasobitel = cislo * 100;
            break;
        case "cm":
            nasobitel = cislo * 10;
            break;

        case "mm":
            nasobitel = cislo * 1;
            break;
        }

        return nasobitel;
    }

    public static void main(String[] args) {

        Main milimetre = new Main();

        Scanner sc = new Scanner(System.in);

        System.out.print("Zadaj dĺžku 1: ");
        float cislo1 = sc.nextFloat();
        String jednotka1 = sc.next();
        float nasobitel1 = milimetre.naMilimetre(jednotka1, cislo1);

        System.out.print("Zadaj dĺžku 2: ");
        float cislo2 = sc.nextFloat();
        String jednotka2 = sc.next();
        float nasobitel2 = milimetre.naMilimetre(jednotka2, cislo2);

        System.out.print("Zadajte znamienko: ");
        String znamienko = sc.next();
        float vysledok;
        if (znamienko == "+") {
            vysledok = nasobitel1 + nasobitel2;
        } else {
            vysledok = nasobitel1 - nasobitel2;
        }

        System.out.println("Vysledok je: " + vysledok);
    }
}
