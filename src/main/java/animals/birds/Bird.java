package animals.birds;

import animals.Animal;

public abstract class Bird extends Animal {

    /**
     * We declare an additional property in Bird which is not specified in Animal. Any class extending Bird will have this
     * wingSpan property, but no other Animals will. Any properties required for Animal are passed up using super(), any
     * others are initialised in the constructor here.
     */

    private int wingSpan;

    public Bird(String name, int age, String species, int wingSpan) {
        super(name, age, species);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
}
