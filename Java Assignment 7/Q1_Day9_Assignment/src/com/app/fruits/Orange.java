package com.app.fruits;

public class Orange extends Fruit
{
    public Orange() {
        this("Orange",170.0,"Orange",true);
    }

    public Orange(String color, double weight, String name, boolean isFresh) {
        super(color, weight, name, isFresh);
    }

    @Override
    public String toString() {
        return "Orange [" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ']';
    }
    public String taste(){
        return "sour";
    }
}
