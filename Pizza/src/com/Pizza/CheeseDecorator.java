package com.Pizza;

public class CheeseDecorator extends AbstractDecorator {
    private final static int CHEESE_EXTRA_PRICE=5;
public CheeseDecorator(Pizza pizza){
super(pizza);
}
public int getPrice(){
   return super.getPrice()+CHEESE_EXTRA_PRICE;
}
}
