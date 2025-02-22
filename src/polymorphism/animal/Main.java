package polymorphism.animal;

public class Main {

    public static void main(String[] args) {
        Animal myPet;

        myPet = new Cat();
        myPet.makeNoise();
        myPet.run();

        myPet = new Dog();
        myPet.makeNoise();
        myPet.run();
    }
}
