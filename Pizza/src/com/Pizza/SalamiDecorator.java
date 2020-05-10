package com.Pizza;

public class SalamiDecorator extends AbstractDecorator {
    private static final int SALAMI_EXTRA_PRICE=5;
    public SalamiDecorator(Pizza pizza){
        super(pizza);
    }
    public int getPrice(){
        return super.getPrice()+SALAMI_EXTRA_PRICE;
    }
}
