import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto mojeAuto = new Auto();
        mojeAuto.znacka = "BMW";
        mojeAuto.zastav(0);
        mojeAuto.nastartuj();
        mojeAuto.zrychli(5);
        System.out.println(mojeAuto.aktualanRychlost);
        mojeAuto.zrychli(5);
        mojeAuto.spomal(-5);
    }
}