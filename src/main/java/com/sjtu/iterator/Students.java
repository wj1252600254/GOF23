package com.sjtu.iterator;

public class Students {
    private Student[] students;

    public Students(Student[] students) {
        this.students = students;
    }

    public StudentIterator createIterator() {
        return new StudentIterator(students);
    }

}
