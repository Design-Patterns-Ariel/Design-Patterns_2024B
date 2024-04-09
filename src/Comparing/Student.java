package Comparing;

import java.util.ArrayList;

public class Student extends Person implements Comparable<Student> {

    private int grade;
    private ArrayList<String> courses;

    public Student(String name, String lastName, double age, int grade) {
        super(name, lastName, age);
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public double getGrade() {
        return grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    @Override
    public String toString() {
        return super.toString() + " " + grade;

    }


    @Override
    public int compareTo(Student o) {

        if (grade > o.getGrade())
            // return grade - o.getGrade() > 0
            return 1;
        if (grade < o.getGrade())
            // return grade - o.getGrade() < 0
            return -1;


        // return grade - o.getGrade() = 0
        return 0;
    }
}
