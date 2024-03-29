package ru.sbercourses.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import ru.sbercourses.data.Student;
import ru.sbercourses.data.enums.Subject;

import java.util.Map;

public class BeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student) {
            Student student = (Student) bean;
            if (student.getName().equals("Jil")) {
                Map<Subject, Integer> subjectIntegerMap = student.getAssessment();
                subjectIntegerMap.entrySet().stream()
                        .filter(entry -> entry.getValue() < 3)
                        .forEach(entry -> entry.setValue(3));
            }
        }
        return bean;
    }
}
