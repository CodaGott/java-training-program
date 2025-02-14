package polymorphism.animal;

public class Dog extends Animal {
    @Override
    void makeNoise() {
        System.out.println("I make dog noise");
    }
}
