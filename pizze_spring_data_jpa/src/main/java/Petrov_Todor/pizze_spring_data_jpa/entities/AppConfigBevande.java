package Petrov_Todor.pizze_spring_data_jpa.entities;

import Petrov_Todor.pizze_spring_data_jpa.entities.enums.DimensioneBevanda;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigBevande {

    @Bean(name = "cocaCola")
    public Bevande cocaCola() {
        return new Bevande("CocaCola", DimensioneBevanda.MEDIUM, 3.50, 185);
    }

    @Bean(name = "acquaLiscia")
    public Bevande acquaLiscia() {
        return new Bevande("Acqua Liscia", DimensioneBevanda.XL, 2.00, 0);
    }

    @Bean(name = "birraSmall")
    public Bevande birraSmall() {
        return new Bevande("Birra Bionda Small", DimensioneBevanda.SMALL, 2.5, 250);
    }

    @Bean(name = "birraMedium")
    public Bevande birraMedium() {
        return new Bevande("Birra Bionda Medium", DimensioneBevanda.MEDIUM, 3.0, 350);
    }

    @Bean(name = "birraXL")
    public Bevande birraXL() {
        return new Bevande("Birra Bionda XL", DimensioneBevanda.XL, 4.50, 450);
    }

    @Bean(name = "fanta")
    public Bevande fanta() {
        return new Bevande("Fanta", DimensioneBevanda.MEDIUM, 3.50, 143);
    }
}
