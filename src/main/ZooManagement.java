package main;

import entities.Animal;
import entities.Aquatic;
import entities.Dolphin;
import entities.Penguin;
import entities.Terrestrial;
import entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal elephant = new Animal("Éléphant", "Dumbo", 10, true);
        Animal tiger = new Animal("Félin", "Tigrou", 4, true);
        Animal zebra = new Animal("Equidé", "Zaza", 3, true);

        Zoo zoo = new Zoo("Parc des animaux", "Paris", 25);

        System.out.println("Ajout Simba : " + zoo.addAnimal(lion));
        System.out.println("Ajout Dumbo : " + zoo.addAnimal(elephant));
        System.out.println("Ajout Tigrou : " + zoo.addAnimal(tiger));
        System.out.println("Ajout Zaza : " + zoo.addAnimal(zebra));

        System.out.println("Zoo plein ? " + zoo.isZooFull());
        System.out.println("Indice Simba : " + zoo.searchAnimalByName("Simba"));
        System.out.println("Indice inconnu : " + zoo.searchAnimalByName("Inconnu"));

        zoo.displayAnimals();
        System.out.println("Suppression Simba : " + zoo.removeAnimal("Simba"));
        zoo.displayAnimals();

        Zoo zoo2 = new Zoo("Zoo 2", "Lyon", 25);
        zoo2.addAnimal(new Animal("Félin", "Luna", 6, true));

        Zoo largerZoo = zoo.compareTo(zoo2);
        System.out.println("Zoo le plus rempli : " + largerZoo.getZooName());

        // ==========================================
        // PROSIT 5
        // ==========================================

        // --- Instruction 21 : Instanciation avec constructeurs par défaut ---
        System.out.println("\n========== Instruction 21 : Constructeurs par défaut ==========");
        // Remarque : "new Aquatic()" n'est plus possible car Aquatic est devenue abstraite à l'instruction 26.
        Terrestrial terrestrialDefault = new Terrestrial();
        Dolphin dolphinDefault = new Dolphin();
        Penguin penguinDefault = new Penguin();
        System.out.println("Objets créés avec succès avec les constructeurs par défaut.");

        // --- Instruction 22 & 23 : Constructeurs paramétrés et redéfinition de toString() ---
        System.out.println("\n========== Instructions 22 & 23 : Constructeurs paramétrés & toString() ==========");
        // Remarque : "new Aquatic(...)" n'est plus possible directement car Aquatic est abstraite.
        Terrestrial terrestrial = new Terrestrial("Félin", "Simba", 4, true, 4);
        Dolphin dolphin = new Dolphin("Cétacé", "Flipper", 6, true, "Mer", 32.5f);
        Penguin penguin = new Penguin("Sphéniscidé", "Skipper", 3, false, "Banquise", 20.0f);

        System.out.println("Terrestrial : " + terrestrial);
        System.out.println("Dolphin     : " + dolphin);
        System.out.println("Penguin     : " + penguin);

        // --- Instruction 24 : Comportement de nage (swim) ---
        System.out.println("\n========== Instruction 24 : Comportement de nage (swim) ==========");
        System.out.print("Dolphin : ");
        dolphin.swim();
        System.out.print("Penguin : ");
        penguin.swim();

        // ==========================================
        // PROSIT 6
        // ==========================================

        // --- Instruction 25 : Tableau d'animaux aquatiques & Ajout dans le Zoo ---
        System.out.println("\n========== Instruction 25 : Ajout d'animaux aquatiques ==========");
        Dolphin d1 = new Dolphin("Delphinidae", "Flipper", 5, true, "Océan", 35.0f);
        Dolphin d2 = new Dolphin("Delphinidae", "Echo", 7, true, "Océan", 40.0f);
        Penguin p1 = new Penguin("Spheniscidae", "Kowalski", 4, false, "Banquise", 25.5f);
        Penguin p2 = new Penguin("Spheniscidae", "Rico", 3, false, "Banquise", 55.0f);
        Penguin p3 = new Penguin("Spheniscidae", "Private", 2, false, "Banquise", 15.0f);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(d2);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);
        zoo.addAquaticAnimal(p3);
        System.out.println("Animaux aquatiques ajoutés au zoo : " + zoo.getNbrAquatics());

        // --- Instruction 26 : Appel de la méthode swim() pour tous les animaux aquatiques ---
        System.out.println("\n========== Instruction 26 : Appel de swim() pour tous les animaux aquatiques ==========");
        for (int i = 0; i < zoo.getNbrAquatics(); i++) {
            zoo.getAquaticAnimals()[i].swim();
        }

        // --- Instruction 27 : Profondeur maximale des pingouins ---
        System.out.println("\n========== Instruction 27 : Profondeur maximale des pingouins ==========");
        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println("Profondeur maximale de nage des pingouins : " + maxDepth + " mètres");

        // --- Instruction 28 : Affichage du nombre par type ---
        System.out.println("\n========== Instruction 28 : Affichage du nombre par type ==========");
        zoo.displayNumberOfAquaticsByType();

        // --- Instruction 31 : Redéfinition de equals() ---
        System.out.println("\n========== Instruction 31 : Redéfinition de equals() ==========");
        Dolphin dSame = new Dolphin("Delphinidae", "Flipper", 5, true, "Océan", 50.0f); // même nom, âge, habitat mais vitesse différente
        Dolphin dDifferentAge = new Dolphin("Delphinidae", "Flipper", 6, true, "Océan", 35.0f); // âge différent
        Dolphin dDifferentHabitat = new Dolphin("Delphinidae", "Flipper", 5, true, "Mer Rouge", 35.0f); // habitat différent
        Penguin pSame = new Penguin("Spheniscidae", "Kowalski", 4, false, "Banquise", 30.0f); // même nom, âge, habitat mais profondeur différente

        System.out.println("d1.equals(dSame) [mêmes nom, âge, habitat, vitesse différente] : " + d1.equals(dSame)); // true
        System.out.println("d1.equals(dDifferentAge) [âge différent] : " + d1.equals(dDifferentAge)); // false
        System.out.println("d1.equals(dDifferentHabitat) [habitat différent] : " + d1.equals(dDifferentHabitat)); // false
        System.out.println("p1.equals(pSame) [mêmes nom, âge, habitat, profondeur différente] : " + p1.equals(pSame)); // true
        System.out.println("d1.equals(p1) [dauphin vs pingouin] : " + d1.equals(p1)); // false
    }
}
