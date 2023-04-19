package ComponentScan;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    public String teach(){
        return "He teaches Spring Boot";
    }
}
