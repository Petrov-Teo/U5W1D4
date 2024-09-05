package Petrov_Todor.pizze_spring_data_jpa.entities.toppings;

import Petrov_Todor.pizze_spring_data_jpa.entities.Calorie;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;
@Entity
@Component
public class Mozzarella implements Topping, Calorie {
    private final double prezzoAggiuntivo;
    private final double calorie;

    public Mozzarella() {
        this.prezzoAggiuntivo = 3;
        this.calorie = 220;
    }

    @Override
    public String toString() {
        return "Mozzarella{" +
                "prezzoAggiuntivo=" + prezzoAggiuntivo +
                '}';
    }

    @Override
    public String getNome() {
        return "Mozzarella";
    }

    @Override
    public double getPrezzoAggiuntivo() {
        return prezzoAggiuntivo;
    }

    @Override
    public double getCalorie() {
        return calorie;
    }
}
