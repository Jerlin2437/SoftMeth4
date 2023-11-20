package com.example.softmeth4.pizzas;

import com.example.softmeth4.enums.Sauce;
import com.example.softmeth4.enums.Size;
import com.example.softmeth4.enums.Topping;

import java.util.ArrayList;

public class BuildYourOwn extends Pizza{
    public BuildYourOwn(Size size,  boolean extraSauce, boolean extraCheese, Sauce sauce, ArrayList<Topping> toppings) {
        super(size, extraSauce, extraCheese);
        this.sauce = sauce;
        this.toppings = toppings;
    }
    @Override
    protected String getPizzaType() {
        return "BYO";
    }
    @Override
    public double price() {
        double extraCost = 0.0;
        if (hasExtraSauce(extraSauce)){
            extraCost += 1.0;
        }
        if (hasExtraCheese(extraCheese)){
            extraCost += 1.0;
        }
        if (toppings.size() <= 3){
            return 8.99 + size.getPrice() + extraCost;
        }
        else
            return (8.99 + size.getPrice() + (toppings.size() - 3) * 1.49) + extraCost;
    }
}
