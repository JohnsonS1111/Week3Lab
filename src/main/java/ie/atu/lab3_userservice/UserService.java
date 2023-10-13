package ie.atu.lab3_userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService){
        this.emailService = emailService;
    }

    public String registerUser(String name, String email){
       emailService.sendEmail(email, " ->Welcome to our platform " + name);
       return "Name: " + name + " Email: " + email;
    }
}
