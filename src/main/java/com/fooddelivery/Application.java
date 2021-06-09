package com.fooddelivery;

import java.util.Scanner;

public class Application {


   /* private void printStarterItems(){
        FoodStore.printStarterItems();
    }
    private void printMainCourse(){
        FoodStore.printMainCourse();
    }*/

    public static void main(String[] args) {
        FoodStore foodStore = new FoodStore();

        System.out.println("------------Welcome to Food delivery system----------------");


        ChickenKadahi chickenKadahi = new ChickenKadahi();
        chickenKadahi.getFoodName();
        chickenKadahi.setFoodType(FoodType.NON_VEG);
        chickenKadahi.setPrice(200);
        chickenKadahi.setTaste(Taste.SPICY);

        PaneerChilly paneerChilly = new PaneerChilly();
        paneerChilly.getFoodName();
        paneerChilly.setFoodType(FoodType.VEG);
        paneerChilly.setPrice(180F);
        paneerChilly.setTaste(Taste.SALTY);

        MuttonChilly muttonChilly = new MuttonChilly();
        muttonChilly.getFoodName();
        muttonChilly.setFoodType(FoodType.NON_VEG);
        muttonChilly.setPrice(250f);
        muttonChilly.setTaste(Taste.MORE_SPICY);



        FruitSalad fruitSalad = new FruitSalad();
        FruitSalad.getFoodName();
        FruitSalad.setFoodType(FoodType.VEG);
        FruitSalad.setPrice(250f);
        FruitSalad.setTaste(Taste.MORE_SPICY);

        Juice juices = new Juice();
        juices.getFoodName();
        juices.setFoodType(FoodType.FRUITS);
        juices.setPrice(250f);
        juices.setTaste(Taste.SWEET);




        foodStore.prepare(chickenKadahi);
        foodStore.prepare(paneerChilly);
        foodStore.prepare(muttonChilly);
        foodStore.prepare(fruitSalad);
        foodStore.prepare((juices);

        foodStore.printValue();

        foodStore.deliver(chickenKadahi);
        System.out.println("food items are deliver-----------");

        foodStore.printValue();

        foodStore.createSystemMenu();

    }
}
