package entities;

public class Animal {
    private final String family;
    private final String name;
    private final int age;
    private final Boolean isMammal;

    public Animal(String family, String name, int age, Boolean isMammal) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge d'un animal ne peut pas être négatif.");
        }

        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getIsMammal() {
        return isMammal;
    }
}