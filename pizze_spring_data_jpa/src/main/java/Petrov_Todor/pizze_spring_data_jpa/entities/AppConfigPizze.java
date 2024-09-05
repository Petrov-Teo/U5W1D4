package Petrov_Todor.pizze_spring_data_jpa.entities;


import Petrov_Todor.pizze_spring_data_jpa.entities.enums.BasePizza;
import Petrov_Todor.pizze_spring_data_jpa.entities.enums.DimensionePizza;
import Petrov_Todor.pizze_spring_data_jpa.entities.enums.TipoImpasto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfigPizze {


    @Bean
    public Pizza margherita() {
        return new Pizza(
                "Margherita",
                TipoImpasto.NORMALE,
                BasePizza.ROSSA,
                DimensionePizza.MEDIA,
                List.of("pomodoro", "mozzarella"),
                List.of(),
                8.00,
                false, 385);
    }

    @Bean
    public Pizza capricciosa() {
        return new Pizza(
                "Capricciosa",
                TipoImpasto.NORMALE,
                BasePizza.ROSSA,
                DimensionePizza.MEDIA,
                List.of("mozzarella", "carciofi", "uova", "olive", "prosciutto crudo", "parmigiano"),
                List.of(),
                15.00,
                false, 850);

    }

    @Bean
    public Pizza patate() {

        return new Pizza(
                "Patate",
                TipoImpasto.NORMALE,
                BasePizza.BIANCA,
                DimensionePizza.MEDIA,
                List.of("patate", "mozzarella", "rosmarino"),
                List.of(),
                9.50,
                false, 457);

    }

    @Bean
    public Pizza quattroFormaggi() {
        return new Pizza(
                "Quattro Formaggi",
                TipoImpasto.NORMALE,
                BasePizza.BIANCA,
                DimensionePizza.MEDIA,
                List.of("parmigiano", "gorgonzola", "mozzarella", "ricotta"),
                List.of(),
                13.00,
                false, 854);

    }

}
