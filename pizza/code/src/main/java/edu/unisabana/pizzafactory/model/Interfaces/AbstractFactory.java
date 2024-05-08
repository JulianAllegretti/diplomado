package edu.unisabana.pizzafactory.model.Interfaces;

import edu.unisabana.pizzafactory.model.Interfaces.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IMoldeadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IHorneadorPizza;

public interface AbstractFactory {
    public IAmasadorPizza createAmasadorPizza();
    public IMoldeadorPizza createMoldeadorPizza();
    public IHorneadorPizza createHorneadorPizza();
}
