package animals.reptiles;

public class Tortoise extends Reptile{

    public Tortoise(String name, int age, String species) {
        super(name, age, species);
    }

    public String layEggs(){
        return "dig a hole and lay them there";
    }
}
