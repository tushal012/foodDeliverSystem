package com.fooddelivery;

public class Juice extends FoodItem{
    public Juice() {
        this.setFoodName("Juices");
        this.setFoodType(FoodType.FRUITS);
        this.setFoodCategory(FoodCategory.DRINK);
    }
}
