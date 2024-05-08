package edu.unisabana.pizzafactory.model.Pizzas.Gruesa;

import edu.unisabana.pizzafactory.model.Interfaces.IAmasadorPizza;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements IAmasadorPizza {
    @Override
    public void amasar() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Gruesa.AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa convencional.");
    }
}
