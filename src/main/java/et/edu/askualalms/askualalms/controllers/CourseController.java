package et.edu.askualalms.askualalms.controllers;

import et.edu.askualalms.askualalms.domains.Course;
import et.edu.askualalms.askualalms.domains.StudentAccount;
import et.edu.askualalms.askualalms.services.CourseService;
import et.edu.askualalms.askualalms.services.StudentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/api/course/create")
    public Course createCourse(@RequestBody Course course){
      return   courseService.createCourse(course);
    }
    @GetMapping("/api/course/list")
    public Iterable<Course> listCourse(){

        return courseService.allCourse();
    }
}
