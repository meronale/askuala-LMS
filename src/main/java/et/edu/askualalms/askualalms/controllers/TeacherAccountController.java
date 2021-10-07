package et.edu.askualalms.askualalms.controllers;


import et.edu.askualalms.askualalms.domains.TeacherAccount;
import et.edu.askualalms.askualalms.services.TeacherAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherAccountController {

    @Autowired
    private TeacherAccountService teacherAccountService;


    @PostMapping("/api/teacherAccount/create")
    public TeacherAccount createTeacherAccount(@RequestBody TeacherAccount teacherAccount){
        return teacherAccountService.createTeacherAccount(teacherAccount);
    }

    @GetMapping("/api/teacherAccount/list")
    public Iterable<TeacherAccount> listTeacherAccount(){
        return teacherAccountService.allTeacherAccount();
    }
}
