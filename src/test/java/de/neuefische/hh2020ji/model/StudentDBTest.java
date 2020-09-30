package de.neuefische.hh2020ji.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void testList() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Jane Doe", 1));
        students.add(new Student("John Doe", 2));

        StudentDB studentDB = new StudentDB(students);

        ArrayList<Student> actual = studentDB.list();

        assertArrayEquals(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2)
        }, actual.toArray());
    }

    @Test
    void testToString(){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Jane Doe", 1));
        students.add(new Student("John Doe", 2));

        StudentDB studentDB = new StudentDB(students);

        String expected = "StudentDB(\n"
                +"Student(name=Jane Doe, id=1)\n"
                +"Student(name=John Doe, id=2)\n"
                +")";

        String actual = studentDB.toString();

        assertEquals(expected, actual);
    }
/*
    @Test
    void testAddStudent(){
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2)
        });

        studentDB.add(new Student("Molly Doe", 3));

        Student[] actual = studentDB.list();

        assertArrayEquals(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2),
                new Student("Molly Doe", 3)
        }, actual);
    }
*/

    @Test
    void testRemoveStudent(){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Jane Doe", 1));
        students.add(new Student("John Doe", 2));
        students.add(new Student("Molly Doe", 3));

        StudentDB studentDB = new StudentDB(students);

        studentDB.remove(2);

        Object[] actual = studentDB.list().toArray();

        assertArrayEquals(new Student[]{
                new Student("Jane Doe", 1),
                new Student("Molly Doe", 3)
        }, actual);
    }
/*
    @Test
    void testRemoveLastStudent(){
        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2),
                new Student("Molly Doe", 3)
        });

        studentDB.remove(3);

        Student[] actual = studentDB.list();

        assertArrayEquals(new Student[]{
                new Student("Jane Doe", 1),
                new Student("John Doe", 2)
        }, actual);
    }
*/

}