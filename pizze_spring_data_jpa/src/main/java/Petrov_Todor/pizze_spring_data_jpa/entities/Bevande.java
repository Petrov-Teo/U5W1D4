package Petrov_Todor.pizze_spring_data_jpa.entities;


import Petrov_Todor.pizze_spring_data_jpa.entities.enums.DimensioneBevanda;
import lombok.Getter;

public class Bevande implements Calorie {
    @Getter
    private String nome;
    @Getter
    private DimensioneBevanda dimensioneBevanda;
    @Getter
    private double prezzo;
    private double calorie;

    public Bevande(String nome, DimensioneBevanda dimensioneBevanda, double prezzo, double calorie) {
        this.nome = nome;
        this.dimensioneBevanda = dimensioneBevanda;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDimensioneBevanda(DimensioneBevanda dimensioneBevanda) {
        this.dimensioneBevanda = dimensioneBevanda;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return "Bevande{" +
                "nome='" + nome + '\'' +
                ", dimensioneBevanda=" + dimensioneBevanda +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                '}';
    }
}
