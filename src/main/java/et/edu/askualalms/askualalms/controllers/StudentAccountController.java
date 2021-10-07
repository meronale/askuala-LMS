package et.edu.askualalms.askualalms.controllers;

import et.edu.askualalms.askualalms.domains.StudentAccount;
import et.edu.askualalms.askualalms.services.StudentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentAccountController {


    @Autowired
    private StudentAccountService studentAccountService;

    @PostMapping("/api/studentAccount/create")
    public StudentAccount createStudentAccount(@RequestBody StudentAccount studentAccount){
      return studentAccountService.createStudentAccount(studentAccount);
    }


    @GetMapping("https://askuala-lms.herokuapp.com/api/studentAccount/list")
    public Iterable<StudentAccount> listStudentAccount(){
        return studentAccountService.allStudentAccount();
    }
}
