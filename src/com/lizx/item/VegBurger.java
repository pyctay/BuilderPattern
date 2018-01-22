package com.lizx.item;

/**
 * 食物具体实现类：蔬菜汉堡
 *
 * @version 2018/1/22 16:01:15
 * @auther Pyctay
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public double price() {
        return 4.5;
    }
}
