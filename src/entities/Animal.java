package entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private Boolean isMammal;

    public Animal(String family, String name, int age, Boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = 0;
        this.isMammal = isMammal;
        setAge(age);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age < 0) {
            return false;
        }

        this.age = age;
        return true;
    }

    public Boolean getIsMammal() {
        return isMammal;
    }

    public Boolean isMammal() {
        return isMammal;
    }

    public Boolean IsMammal() {
        return isMammal;
    }

    public void setIsMammal(Boolean isMammal) {
        this.isMammal = isMammal;
    }
}