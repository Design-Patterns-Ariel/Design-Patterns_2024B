package Comparing;

public class Worker extends Person implements Comparable<Worker> {

    private double salary;
    private double seniority;

    public Worker(String name, String lastName, double age, double salary, double seniority) {
        super(name, lastName, age);
        this.salary = salary;
        this.seniority = seniority;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSeniority() {
        return seniority;
    }

    public void setSeniority(double seniority) {
        this.seniority = seniority;
    }

    @Override
    public int compareTo(Worker o) {
        if (seniority > o.getSeniority())
            // return seniority - o.getSeniority() > 0
            return 1;
        if (seniority < o.getSeniority())
            // return seniority - o.getSeniority() < 0
            return -1;

        // return seniority - o.getSeniority() = 0
        return 0;
    }
}
