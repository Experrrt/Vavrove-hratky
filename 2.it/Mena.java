import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Mena {

    String[] mena = { "Anicka", "Ferko", "Trunko", "Jozko", "Dadko" };
    int[] poleIndexov = { 0, 1, 2, 3, 4 };
    int[] randomIndexy = { 0, 1, 2, 3, 4 };
    Random rnd = new Random();

    public void nahodnePreusporiadaj() {
        int medziIndex = 0;
        int nahodnyIndex = 0;

        for (int i = 0; i < poleIndexov.length; i++) {
            nahodnyIndex = rnd.nextInt(poleIndexov.length);
            medziIndex = randomIndexy[nahodnyIndex];
            randomIndexy[nahodnyIndex] = randomIndexy[i];
            randomIndexy[i] = medziIndex;
        }
    }

    public void vypisPriradenie() {
        for (int i = 0; i < mena.length; i++) {
            System.out.println(mena[poleIndexov[i]] + " = " + mena[randomIndexy[i]]);
        }
    }

    public void skontrolujZoradenie() {
        boolean opakujZnahodnenie = false;
        do {
            System.out.print(".");
            nahodnePreusporiadaj();
            opakujZnahodnenie = false;
            for (int i = 0; i < poleIndexov.length; i++) {
                if (poleIndexov[i] == randomIndexy[i]) {
                    opakujZnahodnenie = true;
                }
            }
        } while (opakujZnahodnenie);
        System.out.println("OK");
    }

    public void zapisDoSuboru() {
        String nazovAdresara = "outTXT";
        File adresar = new File(nazovAdresara);

        if (!adresar.exists() && !adresar.mkdir()) {
            System.out.println("Nepodarilo sa vytvorit adresar");
        }

        for (int i = 0; i < mena.length; i++) {

            File file = new File(nazovAdresara + "/" + mena[i] + ".txt");

            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(mena[randomIndexy[i]]);
                fileWriter.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Mena mena = new Mena();

        mena.skontrolujZoradenie();
        mena.zapisDoSuboru();
        mena.vypisPriradenie();
    }
}
