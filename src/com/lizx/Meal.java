package com.lizx;

import com.lizx.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 点餐
 *
 * @version 2018/1/22 16:06:58
 * @auther Pyctay
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }
    public void getCost(){
        double cost = 0.0;
        for(Item item:items){
            cost += item.price();
        }
        System.out.println("套餐总价:"+cost);
    }
    public void showItems(){
        for(Item item:items){
            System.out.println("食物："+item.name());
            System.out.println("包装："+item.paking().pack());
            System.out.println("价格："+item.price());
        }

    }
}
