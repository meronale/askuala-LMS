
package et.edu.askualalms.askualalms.controllers;
import et.edu.askualalms.askualalms.domains.ContactUs;
import et.edu.askualalms.askualalms.domains.Course;
import et.edu.askualalms.askualalms.services.ContactUsService;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;



@RestController
public class ContactUsController {
    @Autowired
    private ContactUsService contactUsService;

    @PostMapping("/api/contactUs/create")
    public ContactUs createContactUs(@RequestBody ContactUs contactUs){
        return  contactUsService.createContactUs(contactUs);
    }
    @GetMapping("/api/contactUs/list")
    public Iterable<ContactUs> listCourse(){

        return contactUsService.allContactUs();
    }
}
