package com.lizx.item;

/**
 * 食物具体实现类：可口可乐
 *
 * @version 2018/1/22 16:04:28
 * @auther Pyctay
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public double price() {
        return 3;
    }
}
