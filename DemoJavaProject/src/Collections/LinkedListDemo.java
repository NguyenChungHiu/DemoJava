package Collections;

import java.util.*;

class Student {
    private String name;
    private int age;
 
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "Student@[name=" + name + ", age=" + age + "]";
    }
}
public class LinkedListDemo {
	public static void main(String[] args) {
        // Create listStudent
        LinkedList<Student> listStudent = new LinkedList<Student>();
        // Create students
        Student student1 = new Student("Bac", 17);
        Student student2 = new Student("Nam", 20);
        Student student3 = new Student("Trung", 19);
        // Add objects to listStudent
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        // Show listStudent
        System.out.println("Show listStudent");
        for (Student student : listStudent) {
            System.out.println("\t" + student.toString());
        }
        // Remove student2 from listStudent
        listStudent.remove(student2);
        // Show listStudent
        System.out.println("Show listStudent");
        for (Student student : listStudent) {
            System.out.println("\t" + student.toString());
        }
    }
}
