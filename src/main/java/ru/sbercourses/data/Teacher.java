package ru.sbercourses.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Teacher {
    @Value("Oleg")
    private String name;
    @Value("Karp")
    private String finalName;
    @Autowired
    private List<Student> students;

    public Teacher() {
    }

    public Teacher(String name, String finalName, List<Student> students) {
        this.name = name;
        this.finalName = finalName;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFinalName() {
        return finalName;
    }

    public void setFinalName(String finalName) {
        this.finalName = finalName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", finalName='" + finalName + '\'' +
                ", students=" + students +
                '}';
    }
}
