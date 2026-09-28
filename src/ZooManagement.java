public class ZooManagement {
    public static void main(String[] args) {
        // Création des animaux avec le constructeur paramétré
        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal elephant = new Animal("Éléphant", "Dumbo", 10, true);

        // Création du tableau d'animaux
        Animal[] animals = {lion, elephant};

        // Création du zoo avec le constructeur paramétré
        Zoo zoo = new Zoo("Parc des animaux", "Paris", 20, animals);

        // Affichage des informations du zoo
        System.out.println(zoo.zooName + " est situé à " + zoo.city + ".");
        System.out.println("Nombre de cages : " + zoo.nbrCages);
        System.out.println("Premier animal : " + zoo.animals[0].name);

        /*
        // Exemple d'utilisation avec les variables séparées (version avant amélioration)
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
        */
    }
}
