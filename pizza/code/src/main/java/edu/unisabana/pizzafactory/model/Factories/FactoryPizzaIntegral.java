package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.Interfaces.AbstractFactory;
import edu.unisabana.pizzafactory.model.Interfaces.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IHorneadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IMoldeadorPizza;
import edu.unisabana.pizzafactory.model.Pizzas.Integral.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.Pizzas.Integral.HorneadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.Pizzas.Integral.MoldeadorPizzaIntegral;

public class FactoryPizzaIntegral implements  AbstractFactory{

    @Override
    public IAmasadorPizza createAmasadorPizza() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public IMoldeadorPizza createMoldeadorPizza() {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public IHorneadorPizza createHorneadorPizza() {
        return new HorneadorPizzaIntegral();
    }
}
