package com.plants;

public class Tree extends Plant{
    private static int TREE_GROW_PER_SEASON=5;

    public Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public void doSummer() {
        setHeight(getHeight() + getGrowPerSeason());
        System.out.printf("%s has grown in Summer %d\n", getName(), getHeight());
    }

    @Override
    public void doAutumn() {
        System.out.printf("%s is not growing in Autumn %d\n", getName(), getHeight());
    }

    @Override
    public int getGrowPerSeason() {
        return TREE_GROW_PER_SEASON;
    }

}

