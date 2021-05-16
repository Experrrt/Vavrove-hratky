public class SumaTrojic {

    public static void vypisPola(int[] cisla) {

        for (int i = 0; i < cisla.length; i++) {
            System.out.print(cisla[i]);
            System.out.print("-");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[] cisla = { 4, 7, 2, 3, 9, 1, 5 };
        int[] sumaTrojic = new int[cisla.length];

        vypisPola(cisla);

        int predchadzajuceCislo;
        int aktualneCislo;
        int nasledujuceCislo;

        for (int i = 0; i < cisla.length; i++) {

            // predchadzajuce
            if (i == 0) {
                predchadzajuceCislo = 0;
            } else {
                predchadzajuceCislo = cisla[i - 1];
            }

            // aktualne
            aktualneCislo = cisla[i];

            // nasledujuce
            if (i == cisla.length - 1) {
                nasledujuceCislo = 0;
            } else {
                nasledujuceCislo = cisla[i + 1];
            }

            sumaTrojic[i] = predchadzajuceCislo + aktualneCislo + nasledujuceCislo;

        }

        vypisPola(sumaTrojic);

        // zadanie = taketo nieco, ale pomocou programu:
        int najvacsieCislo = 0;
        for (int i = 0; i < sumaTrojic.length; i++) {
            if (najvacsieCislo < sumaTrojic[i]) {
                najvacsieCislo = sumaTrojic[i];
            }

        }
        System.out.println("Najvacsia suma je " + najvacsieCislo);

    }

}