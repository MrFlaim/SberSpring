package ru.sbercourses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sbercourses.config.Context;
import ru.sbercourses.data.Teacher;


public class Main {
    public static void main(String[] args) {
        ApplicationContext javaApplicationContext = new AnnotationConfigApplicationContext(Context.class);
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("Context.xml");
        Teacher teacher = (Teacher) javaApplicationContext.getBean("teacher");
        Teacher teacher1 = (Teacher) xmlApplicationContext.getBean("teacher");
        System.out.println(teacher);
        System.out.println(teacher1);
    }
}