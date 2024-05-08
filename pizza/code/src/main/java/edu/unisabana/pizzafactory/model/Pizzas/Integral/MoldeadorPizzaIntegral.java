package edu.unisabana.pizzafactory.model.Pizzas.Integral;

import edu.unisabana.pizzafactory.model.Interfaces.IMoldeadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaIntegral implements IMoldeadorPizza {

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Integral.MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza mediana e integral con masa convencional.");
    }

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Integral.MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza pequena e integral con masa convencional.");
    }
}
