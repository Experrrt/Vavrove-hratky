public class SumaTrojic {

    public static void vypisPole(int[] cisla) {
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(cisla[i]);
            if (i < cisla.length - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] cisla = { 4, 7, 9, 5, 2, 1, 8 };
        int[] sumaTrojic = new int[cisla.length];

        int predchadzajuceCislo;
        int totoCislo;
        int nasledujuceCislo;

        vypisPole(cisla);

        for (int i = 0; i < cisla.length; i++) {

            if (i == 0) {
                predchadzajuceCislo = 0;
            } else {
                predchadzajuceCislo = cisla[i - 1];
            }
            totoCislo = cisla[i];

            if (i == cisla.length - 1) {
                nasledujuceCislo = 0;
            } else {
                nasledujuceCislo = cisla[i + 1];
            }

            sumaTrojic[i] = predchadzajuceCislo + totoCislo + nasledujuceCislo;
        }
        vypisPole(sumaTrojic);
    }
}