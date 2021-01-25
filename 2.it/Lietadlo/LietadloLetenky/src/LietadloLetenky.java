import java.util.*;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

public class LietadloLetenky {
    private int pocRadov = 6, pocSedadiel, cenaPrvaT, cenaDruhaT, obPrvaT, obDruhaT;
    String odkial, kam, listSedadla[][];

    LietadloLetenky(String odkial, String kam, int pocetSedadiel, int cenaPrvaT, int cenaDruhaT) {
        this.odkial = odkial;
        this.kam = kam;
        this.pocSedadiel = pocetSedadiel;
        this.cenaPrvaT = cenaPrvaT;
        this.cenaDruhaT = cenaDruhaT;
        listSedadla = new String[pocRadov][pocetSedadiel];
    }

    public void mainLoop() {
        int odpoved;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[" + odkial + " - " + kam + "]\n");
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
                    break;
                case 2:
                    System.out.println("Predať letenku");
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
            int altCode = 64;
            for (int y = 0; y < pocSedadiel; y++) {
                altCode++;
                if (rnd.nextInt(100) < 30) {
                    listSedadla[i][y] = "\u001B[31m" + Integer.toString(i + 1) + (char) altCode + "\u001B[0m";
                    if (i == 0)
                        obPrvaT++;
                    else
                        obDruhaT++;

                    continue;
                }
                listSedadla[i][y] = Integer.toString(i + 1) + (char) altCode;
            }
        }
        mainLoop();
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
        ArrayList<Integer> ulicky = new ArrayList<Integer>();

        if (pocSedadiel < 4 || pocSedadiel > 9 || pocRadov < 4 || pocRadov > 9) {
            System.out.println("Nespravne zadané parametre");
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
            for (int i = 0; i < pocSedadiel + ulicky.size(); i++) {
                if (ulicky.contains(i)) {
                    pouziteUlicky++;
                    table.addCell(null);
                } else {
                    table.addCell(listSedadla[z][i - pouziteUlicky]);
                }
            }
        }
        System.out.println(table.render() + "\n");
        System.out.println("Počet obsadených miest: " + (obDruhaT + obPrvaT));
    }

    public static void main(String[] args) {
        new LietadloLetenky("PRAGUE", "BRATISLAVA", 9, 4900, 380).generujLietadlo();
    }
}