package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsAPI {

    public static void main(String[] args) {
        /*
        * ArrayList
        * List
        * HashMap
        * Map
        * LinkedList, LinkedHashMap, HashTable
        * */

//        List<String> programmingLangs = new ArrayList<String>();
//        programmingLangs.add("Java");
//        programmingLangs.add("Python");
//        programmingLangs.add("C#");
//        programmingLangs.add("JS");
//        System.out.println(programmingLangs);

        Student student1 = new Student("Mike", 20);
        Student student2 = new Student("Uche", 20);
        Student student3 = new Student("Emma", 20);
        Student student4 = new Student("Joy", 20);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        // Stack ===> LIFO, Last in first out.
        // Queue ===> FIFO, First in first out.

        Set<String> programingLang = new HashSet<>();
        programingLang.add("Java");
        programingLang.add("Python");
        programingLang.add("Golang");

        System.out.println(programingLang);

        System.out.println(students);
    }
}
