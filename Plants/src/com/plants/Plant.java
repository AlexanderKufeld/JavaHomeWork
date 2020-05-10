package com.plants;

public abstract class Plant {
    private String name;
    private int height;
    private int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addYearToAge() {
        this.age ++;
    }

    public abstract int getGrowPerSeason();

    public void doSpring(){
        addYearToAge();
        setHeight(getHeight() + getGrowPerSeason());
        System.out.printf("%s has grown in Spring %d\n", getName(), getHeight());
    }

    public abstract void doSummer();

    public abstract void doAutumn();

    public void doWinter() {
        System.out.printf("%s is not growing in Winter %d\n", getName(), getHeight());
    }
}

