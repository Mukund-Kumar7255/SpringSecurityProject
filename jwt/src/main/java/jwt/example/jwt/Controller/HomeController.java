package jwt.example.jwt.Controller;

import jwt.example.jwt.Entity.UserEntity;
import jwt.example.jwt.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public String getuser()
    {
        return "hello world";
    }
    @GetMapping("/users")
    public List<UserEntity> getusers()
    {
        List<UserEntity> user= userService.getUsers();
        return user;
    }
    @GetMapping("/currentUser")
    public String getLoggedUser(Principal principal)
    {
        return principal.getName();
    }
}
