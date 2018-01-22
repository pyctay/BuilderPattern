package com.lizx.item;

import com.lizx.paking.Bottle;
import com.lizx.paking.Paking;

/**
 * 食物实现类：冷饮
 *
 * @version 2018/1/22 15:59:35
 * @auther Pyctay
 */
public abstract class ColdDrink implements Item {
    @Override
    public Paking paking() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
