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

        System.out.println("Zoo plein ? " + zoo.isFull());
        System.out.println("Indice Simba : " + zoo.searchAnimalByName("Simba"));
        System.out.println("Indice inconnu : " + zoo.searchAnimalByName("Inconnu"));

        zoo.displayAnimals();
        System.out.println("Suppression Simba : " + zoo.removeAnimal("Simba"));
        zoo.displayAnimals();

        Zoo zoo2 = new Zoo("Zoo 2", "Lyon", 25);
        zoo2.addAnimal(new Animal("Félin", "Luna", 6, true));

        Zoo largerZoo = zoo.compareTo(zoo2);
        System.out.println("Zoo le plus rempli : " + largerZoo.getZooName());
    }
}
