package edu.unisabana.pizzafactory.model.Pizzas.Delgada;

import edu.unisabana.pizzafactory.model.Interfaces.IMoldeadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaDelgada implements IMoldeadorPizza {

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Delgada.MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza mediana y delgada con masa convencional.");
    }

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Delgada.MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza pequena y delgada con masa convencional.");
    }
}
