package et.edu.askualalms.askualalms.services;


import et.edu.askualalms.askualalms.domains.TeacherAccount;
import et.edu.askualalms.askualalms.repositories.TeacherAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class TeacherAccountService {

    @Autowired
    private TeacherAccountRepository teacherAccountRepository;
    public TeacherAccount createTeacherAccount (TeacherAccount teacherAccount){
        //validation
        //if(teacherAccount.getDateOfBirth())
      int age =calculateAge(teacherAccount.getDateOfBirth(),LocalDate.now());
        if(age>20){
            return teacherAccountRepository.save(teacherAccount);
        }else{
            System.out.println("Sorry!! Teacher under the age of 20 can not register");
            return null;
        }


    }
    private static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public Iterable<TeacherAccount> allTeacherAccount(){
        return teacherAccountRepository.findAll();

    }

}
