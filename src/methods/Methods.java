package methods;

public class Methods {


    public static void main(String[] args) {
        /* TODO
        * public ===> Accessed from anywhere.
        * protected ===> Accessed with same package or subclass.
        * private ===> Accessed only within the class.
        * default ===> Accessed only within same package.
        * */

        addNumber(2, 2);

        String a = "A";


        System.out.println("INT Result : " + addNumber(2, 2));
        // Overloading
        System.out.println("Double Result : " + addNumber(3, 3));
    }

    // Recursive method
    public int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }


    // access_modifier return_type nameOfMethod(parameters) {}

    public static void addNumber(String a, int b) {
      String result = "a" + b;
    }

    public static double addNumber(double a, double b) {
        return a + b;
    }

}


/*
*
        1. Create a Java program named MethodPractice.
        2. Implement the following tasks using different types of methods in Java.
        3. Use appropriate access modifiers, return types, and parameterized methods.

         * Tasks
         *
        1. Write a static method that takes a user's name as a parameter and prints a personalized greeting.
        2. Create a method to area of a circle given its radius return the area of a circle given. USE THE INBUILT Math method for this.
        3. Define two methods with the same name that multiplies given numbers.
        4. Write a method  that returns the largest of three given numbers.

* */
