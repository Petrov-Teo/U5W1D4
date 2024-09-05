package Petrov_Todor.pizze_spring_data_jpa.services;

import Petrov_Todor.pizze_spring_data_jpa.entities.Pizza;
import Petrov_Todor.pizze_spring_data_jpa.repositories.PizzaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    private static final Logger log = LoggerFactory.getLogger(PizzaService.class);
    @Autowired
    private PizzaRepository pizzaRepository;

public void savePizza(Pizza pizza){
    pizzaRepository.save(pizza);
    log.info("pizza" + pizza.getNome() + "salvato Correttamente!");
}

}
