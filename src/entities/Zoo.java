package entities;

public class Zoo {
    public static final int MAX_CAGES = 25;

    private final int nbrCages;
    private final Animal[] animals;
    private final String zooName;
    private final String city;

    public Zoo(String zooName, String city) {
        this(zooName, city, MAX_CAGES);
    }

    public Zoo(String zooName, String city, int nbrCages) {
        if (zooName == null || zooName.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }

        this.zooName = zooName;
        this.city = city;
        this.nbrCages = Math.min(Math.max(nbrCages, 1), MAX_CAGES);
        this.animals = new Animal[this.nbrCages];
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null || isZooFull()) {
            return false;
        }

        if (searchAnimalByName(animal.getName()) != -1) {
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }

        return false;
    }

    public void displayAnimals() {
        if (getAnimalCount() == 0) {
            System.out.println("Aucun animal dans le zoo.");
            return;
        }

        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.getName() + " (" + animal.getFamily() + ", " + animal.getAge() + " ans)");
            }
        }
    }

    public int searchAnimalByName(String animalName) {
        if (animalName == null) {
            return -1;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equalsIgnoreCase(animalName)) {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(String animalName) {
        int index = searchAnimalByName(animalName);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < animals.length - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animals.length - 1] = null;
        return true;
    }

    public boolean isZooFull() {
        return getAnimalCount() >= nbrCages;
    }

    public boolean isFull() {
        return isZooFull();
    }

    public Zoo compareTo(Zoo otherZoo) {
        if (otherZoo == null) {
            return this;
        }

        return this.getAnimalCount() >= otherZoo.getAnimalCount() ? this : otherZoo;
    }

    public int getAnimalCount() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                count++;
            }
        }
        return count;
    }

    public String getZooName() {
        return zooName;
    }

    public int getNbrCages() {
        return nbrCages;
    }
}