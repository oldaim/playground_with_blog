package playground.codetest;

import java.util.Objects;

public class aboutCommonClass {

    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 20);
        Student student2 = new Student("홍길동", 20);


        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }

}

class Student{

    public String name;
    public int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
