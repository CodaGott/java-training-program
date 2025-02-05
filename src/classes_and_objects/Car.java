package classes_and_objects;


public class Car {

    // Attributes
    private String name;
    private String color;
    private int year;
    private String model;
    private String brand;

    // TODO >>>>> Pillars of OOP
    //  Abstraction.
    //  Encapsulation.
    //  Inheritance.
    //  Polymorphism.

    // constructor
    public Car(){
    }
    // Behaviours ==> Methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void displayCarInfo(){
        System.out.println("Name: " + name + ", Color: " + color + ", Year: " + year + ", Model: " + model + ", Brand: " + brand);
    }
}
