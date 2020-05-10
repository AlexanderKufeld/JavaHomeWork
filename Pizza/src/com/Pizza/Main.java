package com.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza p = new PizzaImplements();
        Pizza extra_Cheese = new CheeseDecorator(p);
        System.out.println("Pizza with extra Cheese costs " + extra_Cheese.getPrice() + " Euro");

        Pizza extra_Salami = new SalamiDecorator(p);
        System.out.println("Pizza with extra Salami costs " + extra_Salami.getPrice() + " Euro");

        Pizza extra_Salami_Cheese = new CheeseDecorator((new SalamiDecorator(p)));
        System.out.println("Pizza with extra Salami und extra Cheese costs " + extra_Salami_Cheese.getPrice());
    }
}
