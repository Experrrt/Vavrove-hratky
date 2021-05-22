import java.util.Scanner;

public class PremenaMasky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadajte masku: ");
        String[] cisla = sc.nextLine().split("\\.");
        int celkovyPocetJednotiek = 0;

        for (int i = 0; i < cisla.length; i++) {
            int cisloMasky = Integer.parseInt(cisla[i]);
            for (int j = 128; j > 0; j /= 2) {
                if (cisloMasky - j >= 0) {
                    celkovyPocetJednotiek++;
                    cisloMasky -= j;
                }
            }
        }
        System.out.println("Celkový počet jednotiek: " + celkovyPocetJednotiek);
    }
}
