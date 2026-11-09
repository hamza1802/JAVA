package entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected Boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, Boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
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
        this.age = age;
        return age >= 0;
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

    @Override
    public String toString() {
        return "family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal;
    }
}
