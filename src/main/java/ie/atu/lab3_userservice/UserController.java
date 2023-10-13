package ie.atu.lab3_userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    private final UserService us;

    @Autowired
    public UserController(UserService us){
        this.us = us;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){
        return us.registerUser(name, email);
    }

    @PostMapping("registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDetails confirmUser(@RequestBody UserDetails userDetails){

        //return us.userDetails();
    }
}
