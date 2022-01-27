package Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                "}\n";
    }
}

public class HashSetDemo {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(1,"A"));
        studentSet.add(new Student(2,"B"));
        studentSet.add(new Student(3,"C"));
        studentSet.add(new Student(1,"D"));
        studentSet.add(new Student(4,"A"));

        System.out.println(studentSet);
    }
}
