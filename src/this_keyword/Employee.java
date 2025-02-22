package this_keyword;

public class Employee {
    private String name;
    private int age;

    public Employee(String name) {
        this(name, 20);
        this.age = 20;
    }


    public Employee() {

    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John");
        System.out.println(emp.age);

        Employee emp2 = new Employee().setName("John");
        emp2.setName("John");

        System.out.println(emp2.name);
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public void printDetails(Employee employee) {
        System.out.println("Print anything");
    }

    public void print(){
        printDetails(this);
    }

}
