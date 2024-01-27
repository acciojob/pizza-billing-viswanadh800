package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        isDelux=true;
        addExtraCheese();
        addExtraToppings();
        // your code goes here
    }
}
