package edu.unisabana.pizzafactory.model.Pizzas.Delgada;

import edu.unisabana.pizzafactory.model.Interfaces.IHorneadorPizza;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaDelgada implements  IHorneadorPizza{
    @Override
    public void hornear() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Delgada.HorneadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Horneando la pizza delgada con masa convencional.");
    }
}
