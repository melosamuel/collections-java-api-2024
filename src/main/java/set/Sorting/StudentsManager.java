package main.java.set.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentsManager {
    Set<Student> studentsSet;

    public StudentsManager() {
        studentsSet = new HashSet<>();
    }

    public void addStudent(String name, long registrationNumber, double grade){
        studentsSet.add(new Student(name, registrationNumber, grade));
    }

    public void removeStudent(long registrationNumber){
        if(studentsSet.isEmpty()) throw new RuntimeException("The set is empty");

        Student studentToRemove = null;

        for(Student student: studentsSet){
            if(student.getRegistrationNumber() == registrationNumber){
                studentToRemove = student;
                break;
            }
        }

        studentsSet.remove(studentToRemove);
    }

    public List<Student> showStudentsByName(){
        if(studentsSet.isEmpty()) throw new RuntimeException("The set is empty");

        List<Student> students = new ArrayList<>(studentsSet);

        Collections.sort(students, new NameComparator());

        return students;
    }

    public List<Student> showStudentsByGrade(){
        if(studentsSet.isEmpty()) throw new RuntimeException("The set is empty");

        List<Student> students = new ArrayList<>(studentsSet);

        Collections.sort(students, new GradeComparator());

        return students;
    }

    public void showStudents(){
        System.out.println(studentsSet);
    }

    public Set<Student> getStudentsSet() {
        return studentsSet;
    }

    public void setStudentsSet(Set<Student> studentsSet) {
        this.studentsSet = studentsSet;
    }
}

class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class GradeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGrade(), o2.getGrade());    
    }
}
