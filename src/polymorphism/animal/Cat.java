package polymorphism.animal;

public class Cat extends Animal {
    @Override
    void makeNoise() {
        System.out.println("I make cat noise");
    }

    @Override
    public void run(){
        System.out.println("cats starts running");
    }

    @Override
    public void run(int speedLevel){
        System.out.println("cats starts running at speedLevel " + speedLevel);
    }

    @Override
    public void run(String name, int speedLevel){
        System.out.println(name + " starts running at speedLevel " + speedLevel);
    }


}
