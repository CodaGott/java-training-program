package loops;

import game.GuessGame;

public class Loops {


    // WHILE LOOP
    // DO-WHILE LOOP
    // FOR LOOP
    // FOR-EACH LOOP

    public static void main(String[] args) {
//        whileLoop();
//        doWhileLoop();
//        enhancedForLoop();
//        nestedLoop();
//        numberIsInList(4);
//        int [] numbers = {10, 20, 30, 40, 50};
//        sumNumbers(numbers);
//        forLoop();

        GuessGame game = new GuessGame();
        game.guess();

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

    public static void enhancedForLoop(){
        String[] foodItems = {"Apple", "Banana", "Pear", "Garri", "Rice"};
        for (String item : foodItems) {
            System.out.println(item);
        }
    }
    public static void forLoop(){
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " +numbers[i]);
        }
    }

    public static void numberIsInList(int num) {
        int [] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            if (number == num) {
                System.out.println("Number found in list");
//                return true;
                break;
            }else {
                System.out.println("Number not found in list");
            }
        }

//        return false;
    }

    public static void sumNumbers(int[] numbers) {
        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }
        System.out.println("Total number is: " + sum);
    }

    public static void nestedLoop(){
        int [][] nestedArray = {{1,2,3},{4,5,6}};
        for (int i = 0; i < nestedArray.length; i++) {
            for (int j = 0; j < nestedArray[i].length; j++) {
                System.out.println(nestedArray[i][j] + " ");
            }
        }
    }
}
