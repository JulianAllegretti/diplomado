package edu.unisabana.pizzafactory.model.Pizzas.Delgada;

import edu.unisabana.pizzafactory.model.Interfaces.IAmasadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaDelgada implements  IAmasadorPizza{

    @Override
    public void amasar() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Delgada.AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");
    }
}
