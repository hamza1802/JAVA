import java.util.Scanner;

public class ZooManagement {

    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();

        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine().trim();
        while (zooName.isEmpty()) {
            System.out.print("Erreur : Le nom ne peut pas être vide. Réessayez : ");
            zooName = scanner.nextLine().trim();
        }
        zm.zooName = zooName;

        System.out.print("Entrez le nombre de cages : ");
        while (true) {
            if (scanner.hasNextInt()) {
                int cageNumber = scanner.nextInt();
                if (cageNumber > 0) {
                    zm.nbrCages = cageNumber;
                    break;
                } else {
                    System.out.print("Erreur : Le nombre doit être un entier strictement positif. Réessayez : ");
                }
            } else {
                System.out.print("Erreur : Valeur invalide. Entrez un nombre entier : ");
                scanner.next();
            }
        }

        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages.");

        scanner.close();
    }
}
