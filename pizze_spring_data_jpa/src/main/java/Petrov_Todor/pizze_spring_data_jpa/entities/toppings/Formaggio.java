package Petrov_Todor.pizze_spring_data_jpa.entities.toppings;


import Petrov_Todor.pizze_spring_data_jpa.entities.Calorie;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;
@Entity
@Component
public class Formaggio implements Topping, Calorie {
    private final double prezzoAggiuntivo;
    private final double calorie;


    public Formaggio() {
        this.prezzoAggiuntivo = 2.50;
        this.calorie = 282;
    }

    @Override
    public String toString() {
        return "Formaggio{" +
                "prezzoAggiuntivo=" + prezzoAggiuntivo +
                ", calorie=" + calorie +
                '}';
    }

    @Override
    public String getNome() {
        return "Formaggio";
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
