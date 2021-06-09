package com.fooddelivery;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodStore {


    public static ArrayList<FoodItem> foodStore = new ArrayList<>();

    public static void printStarterItems() {
        for(FoodItem obj : foodStore) {
            if(obj.getFoodCategory() ==(FoodCategory.Starter))
                System.out.println(obj);
        }

    }

    public static void printMainCourse() {
        for(FoodItem obj : foodStore) {
            if(obj.getFoodCategory() ==(FoodCategory.MAIN_COURSE))
                System.out.println(obj);
        }
    }
    public void printJuices(){
        for(FoodItem obj : foodStore) {
            if(obj.getFoodCategory() ==(FoodCategory.DRINK))
                System.out.println(obj);

    }

    public void prepare(FoodItem foodItem) {
        foodStore.add(foodItem);
    }

    public void deliver(FoodItem foodItem) {
        foodStore.remove(foodItem);
    }

    public void printValue(){
        for(FoodItem foodItem : foodStore) {
            System.out.println(foodItem);
        }


    }


    public void createSystemMenu() {
        System.out.println("1. print Starters");
        System.out.println("2. print Main course");
        System.out.println("3. Print Juices");
        System.out.println("4. Prepare Food");
        System.out.println("5. Deliver Food");
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1: printStarterItems();
                break;

            case 2: printMainCourse();
                break;

            case 3: printJuices();
                break;

            case 4:
                break;

            case 5:
                break;
            default:

        }
    }


}
