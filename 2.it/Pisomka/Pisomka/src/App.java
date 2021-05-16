public class App {
    public static void vypisPole(int[] cisla) {
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(cisla[i]);
            if (i < cisla.length - 1) {
                System.out.print("-");
            }
        }
    }

    public static void bubbleSort(int[] cisla) {
        int aktualneCislo;
        int nasledujuceCislo;
        boolean zopakovaloSa = false;
        int pocetVymen = 0;
        int pomocneCislo;

        do {
            zopakovaloSa = false;
            for (int i = 0; i < cisla.length; i++) {
                if (i < cisla.length - 1) {
                    aktualneCislo = cisla[i];
                    nasledujuceCislo = cisla[i + 1];

                    if (aktualneCislo > nasledujuceCislo) {
                        pocetVymen++;
                        zopakovaloSa = true;
                        pomocneCislo = cisla[i];

                        cisla[i] = cisla[i + 1];
                        cisla[i + 1] = pomocneCislo;
                    }
                }
            }
        } while (zopakovaloSa);

        System.out.print("Bubble sort: ");
        vypisPole(cisla);
        System.out.println(" | Pocet vymen: " + pocetVymen);
    }

    public static void rotujPole(int[] cisla) {
        int prvyIndex = cisla[0];
        for (int i = 0; i < cisla.length; i++) {
            if (i != cisla.length - 1) {
                cisla[i] = cisla[i + 1];
                continue;
            }
            cisla[i] = prvyIndex;
        }
        System.out.print("Rotovane pole: ");
        vypisPole(cisla);
    }

    public static void main(String[] args) {
        bubbleSort(new int[] { 4, 7, 9, 5, 2, 1, 8 });
        rotujPole(new int[] { 4, 7, 9, 5, 2, 1, 8 });
    }
}
