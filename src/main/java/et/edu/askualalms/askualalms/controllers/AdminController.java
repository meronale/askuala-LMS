package et.edu.askualalms.askualalms.controllers;
import et.edu.askualalms.askualalms.domains.Admin;
import et.edu.askualalms.askualalms.domains.ContactUs;
import et.edu.askualalms.askualalms.services.AdminService;
import et.edu.askualalms.askualalms.services.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class AdminController {

        @Autowired
        private AdminService adminService;

        @PostMapping("/api/admin/create")
        public Admin createAdmin(@RequestBody Admin admin){
            return adminService.createAdmin(admin);
        }
        @GetMapping("/api/admin/list")
        public Iterable<Admin> listAdmin(){
            return adminService.allAdmin();
        }
}




