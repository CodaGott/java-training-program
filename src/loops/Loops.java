package loops;

public class Loops {


    // WHILE LOOP
    // DO-WHILE LOOP
    // FOR LOOP
    // FOR-EACH LOOP

    public static void main(String[] args) {
//        whileLoop();
//        doWhileLoop();
        forLoop();
    }

    public static void whileLoop(){
        int count = 20;
        while (count >= 10) {
            System.out.println("count : " + count);
            count--;
        }
    }

    public static void doWhileLoop(){
        int number = 20;
        do {
            System.out.println("number : " + number);
            number++;
        }while (number < 10);
    }

    public static void forLoop(){
        String[] foodItems = {"Apple", "Banana", "Pear", "Garri", "Rice"};
        for (String item : foodItems) {
            System.out.println(item);
        }
    }
}
