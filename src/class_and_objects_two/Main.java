package class_and_objects_two;

import polymorphism.animal.Animal;

public class Main {

    public static void main(String[] args) {
        Person clement = new Person("Clement", "Joseph", 20, "male", "clement@email.com", "08077387", "Lekki Phase 1", "when he was born");
        System.out.println(clement);

        System.out.println();

        Person laz = new Person();
        laz.setFirstName("Lazarus");
        System.out.println(laz.getFirstName());

    }
}
