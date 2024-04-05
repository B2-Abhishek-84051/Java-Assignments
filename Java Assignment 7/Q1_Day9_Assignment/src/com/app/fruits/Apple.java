package com.app.fruits;

public class Apple extends Fruit
{
    public Apple() {
        this("Red",150.0,"Apple",true);
    }

    public Apple(String color, double weight, String name, boolean isFresh) {
        super(color, weight, name, isFresh);
    }

    @Override
    public String toString() {
        return "Apple [" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ']';
    }
    public String taste(){
        return "sweet and sour";
    }
}
