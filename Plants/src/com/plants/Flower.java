package com.plants;

public class Flower extends Plant{
    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    private static int FLOWER_GROW_PER_SEASON=2;

    @Override
    public void doSummer() {
        System.out.printf("%s is not grow in Summer, but flourishing %d\n", getName(), getHeight());
    }

    @Override
    public void doAutumn() {
        setHeight(0);
        System.out.printf("%s is cut to zero in Autumn %d\n", getName(), getHeight());
    }

    @Override
    public int getGrowPerSeason() {
        return FLOWER_GROW_PER_SEASON;
    }


}
