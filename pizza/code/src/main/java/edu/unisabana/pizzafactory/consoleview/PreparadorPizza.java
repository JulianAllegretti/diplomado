
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.Factories.FactoryPizzaDelgada;
import edu.unisabana.pizzafactory.model.Factories.FactoryPizzaGruesa;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Factories.FactoryPizzaIntegral;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Interfaces.AbstractFactory;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.Interfaces.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IHorneadorPizza;
import edu.unisabana.pizzafactory.model.Interfaces.IMoldeadorPizza;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();            
            pp.prepararPizza(ingredientes, Tamano.MEDIANO);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
    }

    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam) throws ExcepcionParametrosInvalidos {
        AbstractFactory factory = selectPizza();

        IAmasadorPizza am = factory.createAmasadorPizza();
        IHorneadorPizza hpd = factory.createHorneadorPizza();
        IMoldeadorPizza mp = factory.createMoldeadorPizza();
        am.amasar();

        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido: " + tam);
        }

	    aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private AbstractFactory selectPizza() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the type of pizza you want.");
        System.out.println("1.-Pizza delgada");
        System.out.println("2.-Pizza gruesa");
        System.out.println("3.-Pizza integral");
        System.out.println("0.-Exit");
        int op = in.nextInt();

        switch (op) {
            case 1:
                return new FactoryPizzaDelgada();
            case 2:
                return new FactoryPizzaGruesa();
            case 3:
                return new FactoryPizzaIntegral();
            case 0:
                System.out.println("See you!");
                System.exit(1);
                break;
            default:
                System.out.println("Invalid option");
                System.exit(1);
        }

        return null;
    }


    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }

}
