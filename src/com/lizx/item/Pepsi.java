package com.lizx.item;

/**
 * 食物具体实现类：百事可乐
 *
 * @version 2018/1/22 16:05:14
 * @auther Pyctay
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public double price() {
        return 2.5;
    }
}
