package com.fooddelivery;

public class FruitSalad extends FoodItem{
    public FruitSalad() {
        this.setFoodName("FruitSalad");
        this.setFoodType(FoodType.VEG);
        this.setTaste(Taste.SALTY);
        this.setFoodCategory(FoodCategory.Starter);

    }
}
