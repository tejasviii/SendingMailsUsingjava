package com.geekster.SpringAnnotation.StudentController;

import com.geekster.SpringAnnotation.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired //Will look for @Configuration / @Component
    @Qualifier("has")
    Student s1;

    @GetMapping(value = "/student")
    public Student getStudent(){
        return s1;
    }
}
