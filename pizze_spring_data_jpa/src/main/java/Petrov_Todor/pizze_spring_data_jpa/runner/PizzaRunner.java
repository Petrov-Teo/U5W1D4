package Petrov_Todor.pizze_spring_data_jpa.runner;

import Petrov_Todor.pizze_spring_data_jpa.entities.Pizza;
import Petrov_Todor.pizze_spring_data_jpa.entities.enums.BasePizza;
import Petrov_Todor.pizze_spring_data_jpa.entities.enums.DimensionePizza;
import Petrov_Todor.pizze_spring_data_jpa.entities.enums.TipoImpasto;
import Petrov_Todor.pizze_spring_data_jpa.services.PizzaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(PizzaRunner.class);

    @Autowired
    private PizzaService pizzaService;

    @Override
    public void run(String... args) {
        Pizza margherita = new Pizza(
                "margherita",
                TipoImpasto.NORMALE,
                BasePizza.BIANCA,
                DimensionePizza.MEDIA,
                List.of("pomodoro", "mozzarella", "basilico"),
                List.of(),
                15.00,
                false,
                450
        );

        try {
            pizzaService.savePizza(margherita);
        } catch (Exception e) {
            log.error("Errore durante il salvataggio della pizza", e);
        }
    }
}