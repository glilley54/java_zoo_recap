package zoo;

import animals.birds.Bird;
import animals.mammals.Mammal;
import animals.reptiles.Reptile;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    private ArrayList<Reptile> reptileHouse;
    private ArrayList<Mammal> mammalField;
    private ArrayList<Bird> birdSanctuary;

    /**
     * We've added a property here which is declared private, but also has no getter. That means it's not possible to
     * access the information stored in the variable from outside the class, making our program more secure.
     */
    private int securityCodeforGate;

    private HashMap<String, Integer> staff;

    public Zoo(){
        this.reptileHouse = new ArrayList<>();
        this.mammalField = new ArrayList<>();
        this.birdSanctuary = new ArrayList<>();

        this.staff = new HashMap<>();

    }

    /**
     * We could add getters for each of our ArrayLists, but because of how collections work in Java that would mean
     * exposing the entire ArrayList to the user. That would make it possible to access the property using the getter
     * then manipulate the value somehow, eg. getReptileHouse().add(unwantedReptile). Adding getters like these would
     * break encapsulation.
     */
//    public ArrayList<Reptile> getReptileHouse() {
//        return reptileHouse;
//    }

//    public ArrayList<Mammal> getMammalField() {
//        return mammalField;
//    }
//
//    public ArrayList<Bird> getBirdSanctuary() {
//        return birdSanctuary;
//    }

    /**
     * We can still expose certain properties of our ArrayLists to anyone using our code, but instead we do it by adding
     * methods which can be called from elsewhere and which return a specific piece of information. This enforces both
     * encapsulation (other developers can only access what we allow them to) and also single responsibility (each method
     * returns a single piece of information)
     */
    public void addReptile(Reptile reptile){
        this.reptileHouse.add(reptile);
    }

    public int countReptiles(){
        return this.reptileHouse.size();
    }

    public boolean isReptileInReptileHouse(Reptile reptile){
        return reptileHouse.contains(reptile);
    }


    
    public void addStaffMember(String jobRole){
        staff.put(jobRole, 1);
    }
}
