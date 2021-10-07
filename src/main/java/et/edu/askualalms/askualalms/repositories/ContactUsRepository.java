package et.edu.askualalms.askualalms.repositories;

import et.edu.askualalms.askualalms.domains.ContactUs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContactUsRepository extends CrudRepository<ContactUs, Long>{
}
