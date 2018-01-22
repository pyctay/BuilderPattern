package com.lizx.item;

import com.lizx.paking.Paking;

/**
 * 食物接口
 *
 * @version 2018/1/22 15:44:56
 * @auther Pyctay
 */
public interface Item {
    public String name();
    public Paking paking();
    public double price();
}
