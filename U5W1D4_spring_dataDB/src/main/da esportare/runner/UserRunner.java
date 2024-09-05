package runner;


import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import services.UserService;

public class UserRunner implements CommandLineRunner {
    User user1 = new User("Pino", "Daniele", "pino@daniele.com", 24, "www.faf.com");
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
    }
}

