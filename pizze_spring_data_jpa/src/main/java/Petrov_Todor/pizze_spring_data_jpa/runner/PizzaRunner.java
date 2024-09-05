package Petrov_Todor.pizze_spring_data_jpa.runner;

import Petrov_Todor.pizze_spring_data_jpa.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;

public class PizzaRunner {
    @Autowired
    private PizzaService pizzaService;


}
