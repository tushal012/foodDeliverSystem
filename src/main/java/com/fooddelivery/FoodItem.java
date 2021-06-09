package com.fooddelivery;

 enum Taste{
    SPICY, SALTY, MORE_SPICY,SWEET;
}

enum FoodType{
     VEG, NON_VEG, FRUITS;
}
enum FoodCategory{
     Starter,MAIN_COURSE, DRINK;
}


public class FoodItem {
    private static String foodName;
    private FoodType foodType;
    private float price;
    private Taste taste;
    private FoodCategory foodCategory;

    public FoodCategory getFoodCategory() {
        return foodCategory;
    }



    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }





    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }


    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }



    public static String getFoodName() {
        return foodName;
    }

    protected void setFoodName(String foodName) {
        this.foodName = foodName;
    }



    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "FoodItem{" +
                "foodType='" + foodType + '\'' +
                ", price=" + price +
                ", Taste='" + taste + '\'' +
                '}';
    }
}




