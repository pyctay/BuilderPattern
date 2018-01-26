package com.lizx.builder;

/**
 * 构建不同参数的对象
 *
 * @version 2018/1/26 16:18:29
 * @auther Pyctay
 */
public class SpecBuilder {
    private double weight;
    private double price;
    private int stock;
    private String attribute_1;
    private String attribute_2;
    private String attribute_3;
    private String attribute_4;
    // 构造函数 接收一个内部类，使用内部类的参数构造对象
    public SpecBuilder(Builder builder) {
        weight = builder.weight;
        price = builder.price;
        stock = builder.stock;
        attribute_1 = builder.attribute_1;
        attribute_2 = builder.attribute_2;
        attribute_3 = builder.attribute_3;
        attribute_4 = builder.attribute_4;
    }

    public static  class Builder{
        private double weight;
        private double price;
        private int stock;
        private String attribute_1 = null;
        private String attribute_2 = null;
        private String attribute_3 = null;
        private String attribute_4 = null;
        // 内部类构造函数，构造必须参数
        public Builder(double weight,double price,int stock){
            this.price = price;
            this.weight = weight;
            this.stock = stock;
        }
        // 构造可选参数
        public Builder attribute_1(String val){
            attribute_1 = val;
            return this;
        }
        public Builder attribute_2(String val){
            attribute_2 = val;
            return this;
        }
        public Builder attribute_3(String val){
            attribute_3 = val;
            return this;
        }
        public Builder attribute_4(String val){
            attribute_4 = val;
            return this;
        }
        public SpecBuilder build(){
            return new SpecBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "重量=" + weight +
                "\r 价格=" + price +
                "\n 库存=" + stock +
                "\n 属性一='" + attribute_1 + '\'' +
                "\n 属性二='" + attribute_2 + '\'' +
                "\n 属性三='" + attribute_3 + '\'' +
                "\n 属性四='" + attribute_4 + '\'' ;
    }
}
