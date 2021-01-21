import java.util.Scanner;

public class DniTyzden {
    public static void main(String[] args) {
        System.out.print("Zadajte den v tyzdni");
        Scanner sc = new Scanner(System.in);
        String den = sc.nextLine();

        switch (den) {
            case "pondelok":
                System.out.println("Pondelok je prvy den v tyzdni");
                break;
            case "utorok":
                System.out.println("Utorok je druhy den v tyzdni");
                break;
            case "streda":
                System.out.println("Streda je treti den v tyzdni");
                break;
            case "stvrtok":
                System.out.println("Stvrtok je stvrty den v tyzdni");
                break;
            case "piatok":
                System.out.println("Piatok je piaty den v tyzdni");
                break;
            case "sobota":
                System.out.println("Sobota je siesty den v tyzdni");
                break;
            case "nedela":
                System.out.println("Nedela je siedmy den v tyzdni");
                break;
            default:
                System.out.println(den + " nie je den v tyzdni");
        }
    }
}