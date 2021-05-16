public class LukyPolia {
    public static void vypisPole(int[] cisla) {
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(cisla[i] + " ");
        }
        System.out.println();
    }

    public static void vypisPoleObratene(int[] cisla) {
        for (int i = 0; i < cisla.length / 2; i++) {
            int medziKolik = cisla[i];
            cisla[i] = cisla[cisla.length - 1 - i];
            cisla[cisla.length - 1 - i] = medziKolik;
        }
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(cisla[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] cisla = { 4, 7, 9, 5, 2, 1, 8 };
        vypisPole(cisla);
        vypisPoleObratene(cisla);

    }
}