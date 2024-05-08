package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.Interfaces.AbstractFactory;
import edu.unisabana.pizzafactory.model.Interfaces.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IHorneadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IMoldeadorPizza;
import edu.unisabana.pizzafactory.model.Pizzas.Delgada.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Pizzas.Delgada.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Pizzas.Delgada.MoldeadorPizzaDelgada;

public class FactoryPizzaDelgada implements  AbstractFactory{

    @Override
    public IAmasadorPizza createAmasadorPizza() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public IMoldeadorPizza createMoldeadorPizza() {
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public IHorneadorPizza createHorneadorPizza() {
        return new HorneadorPizzaDelgada();
    }
}
