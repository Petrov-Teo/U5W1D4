package Petrov_Todor.pizze_spring_data_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Topping {
    @Id
    @GeneratedValue
    private UUID id;
    private  double prezzoAggiuntivo;
    private  double calorie;

    public Topping(double prezzoAggiuntivo, double calorie) {
        this.prezzoAggiuntivo = prezzoAggiuntivo;
        this.calorie = calorie;
    }
    public Topping(){

    }

    public UUID getId() {
        return id;
    }

    public double getPrezzoAggiuntivo() {
        return prezzoAggiuntivo;
    }

    public void setPrezzoAggiuntivo(double prezzoAggiuntivo) {
        this.prezzoAggiuntivo = prezzoAggiuntivo;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "id=" + id +
                ", prezzoAggiuntivo=" + prezzoAggiuntivo +
                ", calorie=" + calorie +
                '}';
    }

}