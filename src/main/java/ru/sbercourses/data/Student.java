package ru.sbercourses.data;

import ru.sbercourses.data.enums.Subject;

import javax.annotation.PostConstruct;
import java.util.Map;

public class Student {
    private String name;
    private String lastName;
    private boolean isOnTheList = false;

    private Map<Subject, Integer> assessment;

    public Student() {
    }

    public Student(String name, String lastName, Map<Subject, Integer> assessment) {
        this.name = name;
        this.lastName = lastName;
        this.assessment = assessment;
    }

    double calculateAvgMark() {
        int markSum = 0;
        for (int mark : this.assessment.values()) {
            markSum += mark;
        }
        return (double) markSum / this.assessment.size();
    }

    @PostConstruct
    void init() {
        double avgMark = calculateAvgMark();
        if (avgMark >= 3) {
            this.isOnTheList = true;
        }
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

    public boolean isOnTheList() {
        return isOnTheList;
    }

    public void setOnTheList(boolean onTheList) {
        isOnTheList = onTheList;
    }

    public Map<Subject, Integer> getAssessment() {
        return assessment;
    }

    public void setAssessment(Map<Subject, Integer> assessment) {
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isOnTheList=" + isOnTheList +
                ", assessment=" + assessment +
                '}';
    }
}
