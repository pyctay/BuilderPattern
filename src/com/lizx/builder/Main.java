package com.lizx.builder;

/**
 * 测试主类
 *
 * @version 2018/1/26 16:34:23
 * @auther Pyctay
 */
public class Main {
    public static void main(String[] args){
        SpecBuilder specBuilder = new SpecBuilder.Builder(2.5,10.0,500).attribute_1("颜色：白色").attribute_2("尺寸：XXL").build();
        System.out.println(specBuilder);
    }
}
