import java.util.*;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

public class LietadloLetenky {
    private int pocRadov = 6, pocSedadiel, cenaPrvaT, cenaDruhaT, obPrvaT, obDruhaT, listSedadla[][];
    String odkial, kam;

    LietadloLetenky(String odkial, String kam, int pocetSedadiel, int cenaPrvaT, int cenaDruhaT) {
        this.odkial = odkial;
        this.kam = kam;
        this.pocSedadiel = pocetSedadiel;
        this.cenaPrvaT = cenaPrvaT;
        this.cenaDruhaT = cenaDruhaT;
        listSedadla = new int[pocRadov][pocetSedadiel];
    }

    public void mainLoop() {
        int odpoved;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n[" + odkial + " - " + kam + "]\n");
            System.out.println("1. Obsadenosť");
            System.out.println("2. Predať letenku");
            System.out.println("3. Štatistika");
            System.out.println("0. Ukončiť \n");

            System.out.print("Voľba: ");
            odpoved = sc.nextInt();

            System.out.println("------------------------------\n");
            switch (odpoved) {
                case 1:
                    vykresliLietadlo();
                    System.out.println("\nPočet obsadených miest: " + (obDruhaT + obPrvaT));
                    break;
                case 2:
                    predajLetenku();
                    break;
                case 3:
                    vypisStatistiku();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            System.out.println("\n------------------------------");
        }
    }

    public void generujLietadlo() {
        Random rnd = new Random();
        for (int i = 0; i < pocRadov; i++) {
            for (int y = 0; y < pocSedadiel; y++) {
                if (rnd.nextInt(100) < 30) {
                    listSedadla[i][y] = 1;
                    if (i == 0)
                        obPrvaT++;
                    else
                        obDruhaT++;

                    continue;
                }
                listSedadla[i][y] = 0;
            }
        }
        mainLoop();
    }

    public void predajLetenku() {
        Scanner sc = new Scanner(System.in);
        int rad, odpoved, trieda;
        char sedadlo;

        System.out.println("[TRIEDA]\n");
        System.out.println("1. Prvá trieda (cena: €" + cenaPrvaT + ")");
        System.out.println("2. Druhá trieda (cena: €" + cenaDruhaT + ")");
        System.out.println("0. Návrat\n");

        System.out.print("Voľba: ");
        odpoved = sc.nextInt();
        trieda = odpoved;
        if (odpoved == 0)
            return;

        System.out.println("\n[MIESTO]\n");
        System.out.println("1. Vybrať miesto");
        System.out.println("2. Prideliť náhodne miesto");
        System.out.println("0. Návrat\n");

        System.out.print("Voľba: ");
        odpoved = sc.nextInt();
        System.out.println();

        if (odpoved == 1) {
            vykresliLietadlo();

            System.out.print("\nZadajte číslo radu: ");
            rad = sc.nextInt();
            System.out.print("Zadajte písmeno sedadla: ");
            sedadlo = sc.next().charAt(0);
            sedadlo = Character.toUpperCase(sedadlo);
            System.out.println();

            if (rad > pocRadov || (sedadlo - 64) > pocSedadiel || listSedadla[rad - 1][sedadlo - 65] == 1
                    || (trieda == 1 && rad != trieda) || (trieda == 2 && rad < 2)) {
                System.out.println("\n\u001B[31mNesprávne zadané parametre.\u001B[0m");
            } else {
                listSedadla[rad - 1][sedadlo - 65] = 1;
                vykresliLietadlo();
                System.out.println("\nPridelené miesto: " + rad + "" + sedadlo);
                if (trieda == 1)
                    obPrvaT++;
                else
                    obDruhaT++;
            }
        } else if (odpoved == 2) {
            Random rnd = new Random();

            while (true) {
                int rndSedadlo = rnd.nextInt(pocSedadiel);
                int rndRad = 0;
                if (trieda == 2) {
                    rndRad = rnd.nextInt(pocRadov - 1) + 1;
                }
                if (listSedadla[rndRad][rndSedadlo] != 1) {
                    listSedadla[rndRad][rndSedadlo] = 1;

                    System.out.println();
                    vykresliLietadlo();
                    System.out.println("\nPridelené miesto: " + (rndRad + 1) + "" + (char) (rndSedadlo + 65));

                    if (trieda == 1)
                        obPrvaT++;
                    else
                        obDruhaT++;
                    break;
                }
            }
        }
    }

    public void vypisStatistiku() {
        int celkovyPocetS = pocRadov * pocSedadiel;
        float pocObsaden = obPrvaT + obDruhaT;
        int moznaSuma = pocSedadiel * cenaPrvaT + (celkovyPocetS - pocSedadiel) * cenaDruhaT;
        float zarobenaSuma = obPrvaT * cenaPrvaT + obDruhaT * cenaDruhaT;

        System.out.println("Celkový počet miest: " + celkovyPocetS);
        System.out.printf("Počet obsadených miest: %.0f (%.1f%%) %n", pocObsaden, (pocObsaden / celkovyPocetS) * 100);
        System.out.printf("Celkové možné výnosy: %,d %n", moznaSuma);
        System.out.printf("Suma za predané lístky: %,.0f (%.1f%%) %n", zarobenaSuma, (zarobenaSuma / moznaSuma) * 100);
    }

    public void vykresliLietadlo() {
        ArrayList<Integer> ulicky = new ArrayList<>();

        if (pocSedadiel < 4 || pocSedadiel > 9 || pocRadov < 4 || pocRadov > 9) {
            System.out.println("\nNespravne zadané parametre");
            System.exit(0);
        }

        switch (pocSedadiel) {
            case 6:
                ulicky.add(3);
                break;
            case 7:
                ulicky.add(2);
                ulicky.add(6);
                break;
            case 8:
                ulicky.add(2);
                ulicky.add(7);
                break;
            case 9:
                ulicky.add(3);
                ulicky.add(7);
                break;
            case 4:
            case 5:
                ulicky.add(2);
                break;
        }

        Table table = new Table(pocSedadiel + ulicky.size(), BorderStyle.DESIGN_FORMAL_WIDE);

        for (int z = 0; z < pocRadov; z++) {
            int pouziteUlicky = 0;
            int altCode = 64;
            for (int i = 0; i < pocSedadiel + ulicky.size(); i++) {
                if (ulicky.contains(i)) {
                    pouziteUlicky++;
                    table.addCell(null);
                } else {
                    altCode++;
                    if (listSedadla[z][i - pouziteUlicky] == 0) {
                        table.addCell(Integer.toString(z + 1) + (char) altCode);
                        continue;
                    }
                    table.addCell("\u001B[31m" + Integer.toString(z + 1) + (char) altCode + "\u001B[0m");
                }
            }
        }
        System.out.println(table.render());
    }

    public static void main(String[] args) {
        new LietadloLetenky("PRAGUE", "BRATISLAVA", 6, 4900, 380).generujLietadlo();
    }
}