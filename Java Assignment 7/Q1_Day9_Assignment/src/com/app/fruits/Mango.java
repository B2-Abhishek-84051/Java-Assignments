package com.app.fruits;

public class Mango extends Fruit
{
    public Mango() {
        this("Yellow",250.0,"Mango",true);
    }

    public Mango(String color, double weight, String name, boolean isFresh) {
        super(color, weight, name, isFresh);
    }

    @Override
    public String toString() {
        return "Mango [" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ']';
    }
    public String taste(){
        return "Sweet";
    }
}
