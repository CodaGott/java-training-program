package methods2_0;

public class Cat extends Animal {


    // Method overriding ::  provides access to specify our impl of a method already in super-class
    @Override
    public void makeSound() {
        System.out.println("Cat makes meow sound");
    }

}
