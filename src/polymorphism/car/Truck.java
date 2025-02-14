package polymorphism.car;

public class Truck extends Vehicle{

    @Override
    public void makeAMove(){
        System.out.println("I move like a Truck");
    }
}
