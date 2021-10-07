package et.edu.askualalms.askualalms.repositories;


import et.edu.askualalms.askualalms.domains.StudentAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//CRUD -
@Repository
public interface StudentAccountRepository extends CrudRepository<StudentAccount, Long> {



}
