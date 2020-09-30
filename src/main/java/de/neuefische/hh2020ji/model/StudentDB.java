package de.neuefische.hh2020ji.model;

import java.util.ArrayList;

public class StudentDB {

    private ArrayList<Student> students = new ArrayList<>();

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> list(){
        return students;
    }

    public Student randomStudent(){
        double random = Math.random();
        int randomIndex = (int) (random * students.size());
        return students.get(randomIndex);
    }

    @Override
    public String toString(){
        String result = "StudentDB(\n";
        for(Student student : students) {
            result += student.toString() + "\n";
        }
        result += ")";
        return result;
    }

    public void add(Student student) {
        students.add(student);
    }

    public Student findById(int id){
        for(Student student : students){
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void remove(int id) {
        Student studentToRemove = findById(id);
        students.remove(studentToRemove);
    }


    private boolean containsId(int id) {
        for(Student student: students) {
            if(student.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
