package et.edu.askualalms.askualalms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name){
        return "hi "+ name;

    }

}