package et.edu.askualalms.askualalms.services;

import et.edu.askualalms.askualalms.domains.StudentAccount;
import et.edu.askualalms.askualalms.domains.TeacherAccount;
import et.edu.askualalms.askualalms.repositories.StudentAccountRepository;
import et.edu.askualalms.askualalms.repositories.TeacherAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class StudentAccountService {

        @Autowired
        private StudentAccountRepository studentAccountRepository;
    public StudentAccount createStudentAccount (StudentAccount studentAccount){
        //validation
        //if(teacherAccount.getDateOfBirth())
        int age =calculateAge(studentAccount.getDateOfBirth(),LocalDate.now());
        if(age>15){
            return studentAccountRepository.save(studentAccount);
        }else{
            System.out.println("Sorry!! Student under the age of 15 can not register");
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


    public Iterable<StudentAccount> allStudentAccount(){
        return studentAccountRepository.findAll();

    }
    }

