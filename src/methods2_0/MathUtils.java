package methods2_0;

public class MathUtils {

    public static void main(String[] args) {
        printNumber(2, 4, 7, 9, 10);
    }

    public int add (int a, int b) {
        return a + b;
    }

    public int add (int a) {
        return a + 2;
    }

    public double add (double a, double b) {
        return a + b;
    }

    public static void printNumber (int... number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }
    }

    public static <T> void printArray (T[] array) {

    }
}
