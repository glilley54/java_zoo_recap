package animals.reptiles;

public class Snake extends Reptile{

    public Snake(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public String layEggs() {
        return null;
    }
}
