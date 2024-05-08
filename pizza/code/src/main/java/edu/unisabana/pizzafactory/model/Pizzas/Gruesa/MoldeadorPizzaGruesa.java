package edu.unisabana.pizzafactory.model.Pizzas.Gruesa;

import edu.unisabana.pizzafactory.model.Interfaces.IMoldeadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements IMoldeadorPizza {

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Gruesa.MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza mediana y gruesa con masa convencional.");
    }

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(edu.unisabana.pizzafactory.model.Pizzas.Gruesa.MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza pequena y gruesa con masa convencional.");
    }
}
