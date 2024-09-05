package Petrov_Todor.pizze_spring_data_jpa.runner;



import Petrov_Todor.pizze_spring_data_jpa.entities.User;
import Petrov_Todor.pizze_spring_data_jpa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


public class UserRunner implements CommandLineRunner {
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
    }

    User user1 = new User("Pino", "Daniele", "pino@daniele.com", 24, "www.faf.com");
}

