package de.neuefische.hh2020ji.model;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {
        StudentDB studentDB = new StudentDB(new ArrayList<Student>());
        studentDB.add(new Student("Jane Doe", 1));
        studentDB.add(new Student("John Doe", 2));
        studentDB.add(new Student("Jack Doe", 3));
        studentDB.add(new Student("Molly Doe", 4));
        studentDB.add(new Student("Frank Dor", 5));

        for (int i = 0; i < 10; i++) {
            System.out.println(studentDB.randomStudent());
        }
    }

}
