package entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String family, String name, int age, Boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Aquatic)) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return this.age == other.age
                && Objects.equals(this.name, other.name)
                && Objects.equals(this.habitat, other.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
}
