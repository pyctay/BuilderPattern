package com.lizx;

import com.lizx.item.ChickenBurger;
import com.lizx.item.Coke;
import com.lizx.item.Pepsi;
import com.lizx.item.VegBurger;

/**
 * 负责创建Meal对象
 *
 * @version 2018/1/22 16:14:13
 * @auther Pyctay
 */
public class MealBuilder {
    public Meal one(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal two(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
