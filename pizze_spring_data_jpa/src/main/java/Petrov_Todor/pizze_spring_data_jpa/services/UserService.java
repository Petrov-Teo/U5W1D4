package Petrov_Todor.pizze_spring_data_jpa.services;

import Petrov_Todor.pizze_spring_data_jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

}
