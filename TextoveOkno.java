public class TextoveOkno {

    public static void vypisTextoveOkno() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 21; j++) {
                if (i == 0 || i == 6) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 0 || j == 20) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void vypisOknoSHranou() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 21; j++) {
                if (j % 2 == 0 && !(i < 3)) {
                    System.out.print("*");
                } else {
                    if (i < 3 && j < 6 - i * 2) {
                        System.out.print(" ");
                    } else if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        vypisTextoveOkno();
        System.out.println("");
        vypisOknoSHranou();
    }
}