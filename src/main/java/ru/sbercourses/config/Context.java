package ru.sbercourses.config;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.sbercourses.data.Student;
import ru.sbercourses.data.enums.Subject;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("ru.sbercourses.data")
public class Context {
    private final Subject[] subjects = Subject.values();

    @Bean
    public Student student1() {
        Map<Subject, Integer> markMap = new HashMap<>();
        for (Subject subject : subjects) {
            markMap.put(subject, 5);
        }
        return new Student("Ivan", "Ivanov", markMap);
    }

    @Bean
    public Student student2() {
        Map<Subject, Integer> markMap = new HashMap<>();
        for (Subject subject : subjects) {
            markMap.put(subject, 2);
        }
        return new Student("Kirill", "Kirillov", markMap);
    }

    @Bean
    public Student student3() {
        Map<Subject, Integer> markMap = new HashMap<>();
        for (Subject subject : subjects) {
            markMap.put(subject, 2);
        }
        return new Student("Jil", "Valentine", markMap);
    }

    @Bean
    public static BeanPostProcessor beanProcessor() {
        return new BeanProcessor();
    }
}
