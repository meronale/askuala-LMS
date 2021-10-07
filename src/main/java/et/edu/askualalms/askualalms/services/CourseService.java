package et.edu.askualalms.askualalms.services;

import et.edu.askualalms.askualalms.domains.Course;
import et.edu.askualalms.askualalms.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse (Course course){

        return courseRepository.save(course);
    }
    public Iterable<Course> allCourse(){
        return courseRepository.findAll();

    }



}