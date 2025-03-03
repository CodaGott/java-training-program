package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
        Student student2 = new Student("Uche", 19);
        Student student3 = new Student("Emma", 20);
        Student student4 = new Student("Joy", 25);

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Collections.sort(students, Comparator.comparingInt(Student::getAge));

        System.out.println("Sorted by age");

        for (Student student : students) {
            System.out.println(student);
        }

//        for (Student student : students) {
//            System.out.println(student);
//        }

//        List<Student> filterStudents = students.stream()
//                .filter(student -> student.getAge() < 20)
//                .toList();
//        System.out.println(filterStudents);



        // Stack ===> LIFO, Last in first out.
        // Queue ===> FIFO, First in first out.

//        Set<String> programingLang = new HashSet<>();
//        programingLang.add("Java");
//        programingLang.add("Python");
//        programingLang.add("Golang");
//
//        List<String> names = List.of("Mike", "Uche", "Emma", "Joy");
//        Set<String> uniqueNames = Set.of("Mike", "Uche", "Emma", "Joy");
//        System.out.println(uniqueNames);
//
//        Map<Integer, String> map = Map.of(1, "Abc");
//        System.out.println(map.get(1));
//
//
//
//        System.out.println(names);


//        List<String> languages = new ArrayList<>();
//        languages.add("Java");
//        languages.add("Python");
//        languages.add("C");
//        languages.add("Golang");
//        languages.add("JavaScript");
//
//        languages.stream().filter(langs -> langs.startsWith("J")).forEach(System.out::println);
//
//        List<Integer> lengths = languages.stream()
//                .map(String::length)
//                .collect(Collectors.toList());
//        System.out.println(lengths);
    }
}
