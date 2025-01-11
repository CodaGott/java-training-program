package conditional_statements;

public class ConditionalStatement {

    public static void main(String[] args) {
//        checkNumbers(101);
        switchStatements(20);
        ternaryOperator(20);
    }


    public static void checkNumbers(int number) {
        /*
        * if (condition){
        *   behavior
        * }
        *  condition ? value_if_true : value_if_false
        *
        * */

        if (number > 10 && number < 100) {
            System.out.println(number + " is greater than 10");
        } else if (number < 10) {
            System.out.println(number + " is less than 10");
        }else {
            System.out.println("Given number higher 100");
        }
    }

    public static void switchStatements(int x){
        /*
        *  switch (condition/expression){
        *       case val:
        *           action
        * }
        *
        * */

        switch(x){
            case 12:
                System.out.println("Given number is 10");
            case 100:
                System.out.println("Given number is 100");
            default:
                System.out.println("Given number not 10 or 100");
        }
    }

    public static void ternaryOperator(int x){
        String result = (x > 10) ? "Given number is greater than 10" : "Given number is less than 10";
        System.out.println(result);
    }
}
