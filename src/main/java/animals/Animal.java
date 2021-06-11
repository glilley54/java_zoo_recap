package animals;

public abstract class Animal {

    /**
     * The properties defined here will be inherited by every class which extends Animal, as will the behaviours defined
     * below
     */

    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    /**
     * Unlike the Zoo, here we have getters to access our properties. In this case we are dealing with Strings and ints,
     * which cannot be manipulated in the same way as ArrayLists so encapsulation is easier to enforce
     */

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Note that we don't need to specify this.age on line 37. That's because the JVM is able to recognise that there
     * hasn't been an age variable passed in to the method, so it will default to looking for a class property.
     */
    public int getAge() {
        return age;
    }

    /**
     * ...whereas here there has been an age parameter specified, so we need to be explicit when referring to the class
     * property.
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
