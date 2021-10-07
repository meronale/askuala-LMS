
package et.edu.askualalms.askualalms.services;

        import et.edu.askualalms.askualalms.domains.ContactUs;
        import et.edu.askualalms.askualalms.domains.Course;
        import et.edu.askualalms.askualalms.repositories.ContactUsRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class ContactUsService {

    @Autowired
    private ContactUsRepository contactUsRepository;

    public ContactUs createContactUs (ContactUs contactUs){

        return contactUsRepository.save(contactUs);
    }
    public Iterable<ContactUs> allContactUs(){
        return contactUsRepository.findAll();

    }



}