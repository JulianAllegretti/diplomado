package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.Interfaces.AbstractFactory;
import edu.unisabana.pizzafactory.model.Interfaces.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IHorneadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IMoldeadorPizza;
import edu.unisabana.pizzafactory.model.Pizzas.Gruesa.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Pizzas.Gruesa.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Pizzas.Gruesa.MoldeadorPizzaGruesa;

public class FactoryPizzaGruesa implements AbstractFactory{

    @Override
    public IAmasadorPizza createAmasadorPizza() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public IMoldeadorPizza createMoldeadorPizza() {
        return new MoldeadorPizzaGruesa();
    }

    @Override
    public IHorneadorPizza createHorneadorPizza() {
        return new HorneadorPizzaGruesa();
    }
}
