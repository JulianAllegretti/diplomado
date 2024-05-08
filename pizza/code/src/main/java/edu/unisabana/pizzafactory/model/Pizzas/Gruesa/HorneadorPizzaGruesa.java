package edu.unisabana.pizzafactory.model.Pizzas.Gruesa;

import edu.unisabana.pizzafactory.model.Interfaces.IHorneadorPizza;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaGruesa implements  IHorneadorPizza{
    @Override
    public void hornear() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Gruesa.HorneadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Horneando la pizza gruesa con masa convencional.");
    }
}
