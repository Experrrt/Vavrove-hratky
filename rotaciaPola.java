public class rotaciaPola {
    public static void vypisPole(int[] cisla) {
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(cisla[i]);
            if (i < cisla.length - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void rotovanie() {
        int[] cisla = { 4, 5, 7, 2, 9, 3, 1 };
        int pomocne = 0;
        for (int i = 0; i < cisla.length; i++) {
            if (i == 0) {
                pomocne = cisla[0];
                cisla[i] = cisla[i + 1];
            } else if (i != cisla.length - 1) {
                cisla[i] = cisla[i + 1];
            } else {
                cisla[i] = pomocne;
            }
        }
        vypisPole(cisla);
    }

    public static void main(String[] args) {
        int[] cisla = { 4, 5, 7, 2, 9, 3, 1 };
        vypisPole(cisla);
        rotovanie();
    }
}