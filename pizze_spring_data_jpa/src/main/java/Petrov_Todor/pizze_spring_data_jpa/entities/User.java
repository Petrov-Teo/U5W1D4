package Petrov_Todor.pizze_spring_data_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private String avatarURL;

    public User(String name, String surname, String email, int age, String avatarURL) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.avatarURL = avatarURL;
    }
}
