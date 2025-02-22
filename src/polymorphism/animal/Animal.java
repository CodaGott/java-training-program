package polymorphism.animal;

public class Animal {

    void makeNoise() {
        System.out.println("Animal makeNoise");
    }
    public void run(){
        System.out.println("Animal starts running");
    }

    public void run(int speedLevel){
        System.out.println("Animal starts running at speedLevel " + speedLevel);
    }

    public void run(String name, int speedLevel){
        System.out.println(name + " starts running at speedLevel " + speedLevel);
    }
}
