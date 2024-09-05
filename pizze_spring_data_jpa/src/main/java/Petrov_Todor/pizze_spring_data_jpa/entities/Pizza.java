package Petrov_Todor.pizze_spring_data_jpa.entities;

import Petrov_Todor.pizze_spring_data_jpa.entities.enums.BasePizza;
import Petrov_Todor.pizze_spring_data_jpa.entities.enums.DimensionePizza;
import Petrov_Todor.pizze_spring_data_jpa.entities.enums.TipoImpasto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Pizze")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Use AUTO for UUID
    private UUID id;

    private String nome;
@Enumerated(EnumType.STRING)
    private TipoImpasto tipoImpasto;
@Enumerated(EnumType.STRING)
    private BasePizza base;

    private DimensionePizza dimensionePizza;

    @ElementCollection
    @CollectionTable(name = "ingredienti", joinColumns = @JoinColumn(name = "pizza_id"))
    @Column(name = "ingrediente")
    private List<String> ingredienti = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "pizza_topping",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> toppings = new ArrayList<>();

    private double prezzo;

    @Setter
    private double calorie;

    private boolean vegetariana;

    // Default constructor
    public Pizza() {}

    // Parameterized constructor
    public Pizza(String nome, TipoImpasto tipoImpasto, BasePizza base, DimensionePizza dimensionePizza,
                 List<String> ingredienti, List<Topping> toppings, double prezzo, boolean vegetariana,
                 double calorie) {
        this.nome = nome;
        this.tipoImpasto = tipoImpasto;
        this.base = base;
        this.dimensionePizza = dimensionePizza;
        this.ingredienti = ingredienti != null ? ingredienti : new ArrayList<>();
        this.toppings = toppings != null ? new ArrayList<>(toppings) : new ArrayList<>();
        this.prezzo = prezzo;
        this.vegetariana = vegetariana;
        this.calorie = calcolaCalorieTotale();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Id=" + id + ", " +
                "nome='" + nome + '\'' + ", " +
                "tipoImpasto=" + tipoImpasto + ", " +
                "base=" + base + ", " +
                "dimensionePizza=" + dimensionePizza + ", " +
                "ingredienti=" + ingredienti + ", " +
                "toppings=" + toppings + ", " +
                "prezzo=" + prezzo + ", " +
                "calorie=" + calorie + ", " +
                "vegetariana=" + vegetariana +
                '}';
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoImpasto getTipoImpasto() {
        return tipoImpasto;
    }

    public void setTipoImpasto(TipoImpasto tipoImpasto) {
        this.tipoImpasto = tipoImpasto;
    }

    public BasePizza getBase() {
        return base;
    }

    public void setBase(BasePizza base) {
        this.base = base;
    }

    public DimensionePizza getDimensionePizza() {
        return dimensionePizza;
    }

    public void setDimensionePizza(DimensionePizza dimensionePizza) {
        this.dimensionePizza = dimensionePizza;
    }

    public List<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(List<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isVegetariana() {
        return vegetariana;
    }

    public void setVegetariana(boolean vegetariana) {
        this.vegetariana = vegetariana;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calcolaPrezzoTotale() {
        double prezzoTotale = prezzo;
        for (Topping topping : toppings) {
            prezzoTotale += topping.getPrezzoAggiuntivo();
        }
        return prezzoTotale;
    }

    public double calcolaCalorieTotale() {

        double calorieTotale = calorie;
        for (Topping topping : toppings) {
            calorieTotale += topping.getCalorie();
        }
        return calorieTotale;
    }
}