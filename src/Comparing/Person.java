package Comparing;

public class Person /*implements Comparable<Person>*/{
    private String name;
    private String lastName;
    private double age;


    public Person(String name, String lastName, double age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "" + name +" "+lastName + " " +age;
    }

//    @Override
//    public int compareTo(Person o) {
//        return name.compareTo(o.name);
//    }
}
