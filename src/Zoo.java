public class Zoo {
    Animal[] animals;
    int nbrCages;
    String zooName;
    String city;

    public Zoo(String zooName, String city, int nbrCages, Animal[] animals) {
        this.zooName = zooName;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }
}
