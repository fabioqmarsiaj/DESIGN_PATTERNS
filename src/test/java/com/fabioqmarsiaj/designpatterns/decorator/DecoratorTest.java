package com.fabioqmarsiaj.designpatterns.decorator;


import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void testDecorator(){
        Pizza pizza = new ThickCrustPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        PizzaIngredients pepperoni = new Pepperoni(pizza);
        System.out.println(pepperoni.getDescription());
        System.out.println(pepperoni.getCost());

        PizzaIngredients doublePepperoni = new Pepperoni(pepperoni);
        System.out.println(doublePepperoni.getDescription());
        System.out.println(doublePepperoni.getCost());
    }
}
