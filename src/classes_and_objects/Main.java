package classes_and_objects;

public class Main {
    public static void main(String[] args) {

        Car tesla = new Car();
        tesla.setBrand("Tesla");
        tesla.setColor("Black");
        tesla.setYear(2020);
        tesla.setModel("Model Y");
        tesla.setName("Tesla");

        System.out.println(tesla);


        Car toyota = new Car();
        toyota.setBrand("Toyota");
        toyota.setColor("Black");
        toyota.setYear(2020);
        toyota.setModel("Matrix");
        toyota.setName("Toyota");

        toyota.displayCarInfo();
    }
}
