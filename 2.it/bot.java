import java.util.Scanner;

public class bot {

    public void Otazka() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Co je to objekt?");
        System.out.println("1. Je to typ dat");
        System.out.println("2. Je to typ premennej");
        System.out.println("3. Je instanciou triedy");
        System.out.println("4. Je to generator bytecodu");

        while (true) {
            int odpoved = sc.nextInt();
            if (odpoved == 3) {
                System.out.println(odpoved + " je spravna odpoved. Prajem pekny den.");
                break;
            } else
                System.out.println(odpoved + " zial nie je spravna odpoved, skuste prosim znova");

        }
    }

    public static void main(String[] args) {

        bot bot = new bot();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ahoj! Volam sa Tob \nMozem sa s tebou porozpravat");
        System.out.println("Prosim, mozes sa mi predstavit");

        String meno = sc.nextLine();

        System.out.println("Mas pekne meno, " + meno);

        System.out.println("Nechaj ma uhadnut tvoj vek");
        System.out.println("Zadaj zvysky delenia tvojho veku 3,5 a 7");

        int zvy3 = sc.nextInt();
        int zvy5 = sc.nextInt();
        int zvy7 = sc.nextInt();

        int vek = (zvy3 * 70 + zvy5 * 21 + zvy7 * 15) % 105;

        System.out.println("Mas " + vek + " rokov: To mas pred sebou este vela veci!");

        System.out.println("Teraz ti ukazem ako sa pocita. Zadaj prosim cislo od 0 do 10");
        int pocet = sc.nextInt();

        for (int i = 0; i <= pocet; i++) {
            System.out.println(i + "!");
        }

        bot.Otazka();
    }
}