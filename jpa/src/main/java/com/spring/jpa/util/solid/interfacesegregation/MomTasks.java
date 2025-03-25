package com.spring.jpa.util.solid.interfacesegregation;

public class MomTasks implements CuisineMissions, ShoppingMissions {

    @Override
    public void cook() {
        System.out.println("Mom cooking");
    }

    @Override
    public void makeJuice() {
        System.out.println("Mom making juice");
    }

    @Override
    public void cleanCuisine() {
        System.out.println("Mom cleaning the cuisine");
    }

    @Override
    public void washDishes() {
        System.out.println("Mom washing dishes");
    }

    @Override
    public void makeHotDrinks() {
        System.out.println("Mom making hot drinks");
    }

    @Override
    public void makeShopping() {
        System.out.println("Mom making shopping");
    }
}
