package com.lizx.item;

import com.lizx.paking.Paking;
import com.lizx.paking.Wrapper;

/**
 * 食物实现类：汉堡
 *
 * @version 2018/1/22 15:50:22
 * @auther Pyctay
 */
public abstract class Burger implements Item{
    @Override
    public Paking paking() {
        return new Wrapper();
    }

    public abstract double price();
}
