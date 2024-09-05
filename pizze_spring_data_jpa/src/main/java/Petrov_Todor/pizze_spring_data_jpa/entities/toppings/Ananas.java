package Petrov_Todor.pizze_spring_data_jpa.entities.toppings;


import Petrov_Todor.pizze_spring_data_jpa.entities.Calorie;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;
@Entity
@Component
public class Ananas implements Topping, Calorie {
    private final double prezzoAggiuntivo;
    private final double calorie;

    public Ananas() {
        this.prezzoAggiuntivo = 2.00;
        this.calorie = 80;
    }

    @Override
    public String toString() {
        return "Ananas{" +
                "prezzoAggiuntivo=" + prezzoAggiuntivo +
                ", calorie=" + calorie +
                '}';
    }

    @Override
    public String getNome() {
        return "Ananas";
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