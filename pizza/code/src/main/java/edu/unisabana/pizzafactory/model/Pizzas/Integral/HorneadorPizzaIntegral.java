package edu.unisabana.pizzafactory.model.Pizzas.Integral;

import edu.unisabana.pizzafactory.model.Interfaces.IHorneadorPizza;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaIntegral implements  IHorneadorPizza{
    @Override
    public void hornear() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Integral.HorneadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Horneando la pizza integral con masa convencional.");
    }
}
