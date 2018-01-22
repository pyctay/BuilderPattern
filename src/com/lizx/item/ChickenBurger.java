package com.lizx.item;

/**
 * 食物具体实现类：鸡肉汉堡
 *
 * @version 2018/1/22 16:03:19
 * @auther Pyctay
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public double price() {
        return 6.5;
    }
}
