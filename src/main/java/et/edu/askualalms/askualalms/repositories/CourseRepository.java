package et.edu.askualalms.askualalms.repositories;

import et.edu.askualalms.askualalms.domains.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseRepository extends CrudRepository<Course, Long> {
}
