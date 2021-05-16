import java.util.Scanner;

public class Nina {

    public float naMilimetre(String jednotka, float cislo) {
        float premenene = 0;

        switch (jednotka) {
        case "km":
            premenene = cislo * 1_000_000;
            break;
        case "m":
            premenene = cislo * 1_000;
            break;
        case "dm":
            premenene = cislo * 100;
            break;
        case "cm":
            premenene = cislo * 10;
            break;

        case "mm":
            premenene = cislo * 1;
            break;
        }
        return premenene;
    }

    public static void main(String[] args) {
        Nina classa = new Nina();
        Scanner scan = new Scanner(System.in);
        float vysledok = 0;

        System.out.print("zadaj cislo: ");
        float zadaneCislo1 = scan.nextFloat();
        String jednotka1 = scan.next();
        float premeneneCislo1 = classa.naMilimetre(jednotka1, zadaneCislo1);

        System.out.print("zadaj cislo: ");
        float zadaneCislo2 = scan.nextFloat();
        String jednotka2 = scan.next();
        float premeneneCislo2 = classa.naMilimetre(jednotka2, zadaneCislo2);

        System.out.print("zadaj plus alebo minus: ");
        String znamienko = scan.next();

        if (znamienko.equals("+")) {
            vysledok = premeneneCislo1 + premeneneCislo2;
        } else if (znamienko.equals("-")) {
            vysledok = premeneneCislo1 - premeneneCislo2;
        }
        System.out.println(vysledok + " mm");
    }
}