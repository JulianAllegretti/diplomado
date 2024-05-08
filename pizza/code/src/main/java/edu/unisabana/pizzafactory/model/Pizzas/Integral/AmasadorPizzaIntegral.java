package edu.unisabana.pizzafactory.model.Pizzas.Integral;

import edu.unisabana.pizzafactory.model.Interfaces.IAmasadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaIntegral implements  IAmasadorPizza{

    @Override
    public void amasar() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Integral.AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza integral con masa convencional.");
    }
}
