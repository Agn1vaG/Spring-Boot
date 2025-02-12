package udemy_learn2.learn_spring_boot.courses.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import udemy_learn2.learn_spring_boot.courses.bean.Course;


@RestController
public class CourseController {

    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"));
    }

    //// http://localhost:8080/courses/1
    @GetMapping("/courses/1")
    public Course getCourseDetails(){
        return new Course(2, "Learn Microservices", "in28minutes");
    }
}
