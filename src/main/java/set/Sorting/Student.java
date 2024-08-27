package main.java.set.Sorting;

public class Student {
    private String name;
    private long registrationNumber;
    private double grade;
    
    public Student(String name, long registrationNumber, double grade) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.grade = grade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (registrationNumber ^ (registrationNumber >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (registrationNumber != other.registrationNumber)
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", registrationNumber=" + registrationNumber + ", grade=" + grade + "]\n";
    }
}
