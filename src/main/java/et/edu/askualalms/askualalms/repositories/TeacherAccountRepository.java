package et.edu.askualalms.askualalms.repositories;


import et.edu.askualalms.askualalms.domains.TeacherAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherAccountRepository extends CrudRepository <TeacherAccount, Long>{



}
