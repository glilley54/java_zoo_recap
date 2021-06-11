package animals.reptiles;

import animals.Animal;

public abstract class Reptile extends Animal {

    public Reptile(String name, int age, String species) {
        super(name, age, species);
    }

    /**
     * Declaring the method to be abstract means that we do not have to specify a method body. Instead we leave that to
     * the classes which extend this one. This means that any developer writing a class which extends Reptile *must*
     * define the layEggs behaviour in their class
     */
    public abstract String layEggs();
}
