package com.spring.jpa.util.solid.interfacesegregation;

public class DaughterTasks implements ClothesMissions, ShoppingMissions {

    @Override
    public void washClothes() {
        System.out.println("Hanaa is washing clothes");
    }

    @Override
    public void hangoutClothes() {
        System.out.println("Hanaa is hanging out clothes");
    }

    @Override
    public void makeShopping() {
        System.out.println("Hanaa is making shopping");
    }
}
