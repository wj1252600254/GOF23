package com.sjtu.iterator;

public class Client {
    public static void main(String[] args) {
        Student[] students = {new Student("Peter"), new Student("Jack"), new Student("Martin"), new Student("Wang")};
        Students student = new Students(students);
        Iterator<Student> iterator = student.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
