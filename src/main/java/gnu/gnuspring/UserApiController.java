package gnu.gnuspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserApiController {
    @GetMapping("/api/users")
    public User user(){
        System.out.println("/api/users");
        User user = new User();
        user.setUsername("user1");
        user.setPassword("pass");
        user.setEmail("111");
        user.setId(1);
        return user;
    }


    @GetMapping("/home")
    public String getHome(){
        return "Hello World!";
    }
}
