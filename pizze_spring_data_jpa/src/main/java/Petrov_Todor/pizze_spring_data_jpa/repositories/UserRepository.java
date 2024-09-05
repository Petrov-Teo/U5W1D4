package Petrov_Todor.pizze_spring_data_jpa.repositories;
import Petrov_Todor.pizze_spring_data_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {


}
