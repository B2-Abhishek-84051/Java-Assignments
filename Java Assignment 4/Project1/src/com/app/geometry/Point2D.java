package com.app.geometry;

import static java.lang.Math.*;
import java.util.Objects;
import java.util.Scanner;

public class Point2D {
    double x;
    double y;
    double distance;
    public String getDetails()
    {
        return "co-ordinates (x,y) = "+"("+x+","+y+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return Double.compare(x, point2D.x) == 0 && Double.compare(y, point2D.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double calculateDistance(Point2D p)
    {
        distance = sqrt( pow((this.y-p.y), 2) + pow((this.x-p.x), 2));
        return  distance;
    }
    public void acceptData()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("x co-ordinate = ");
        this.x = sc.nextDouble();
        System.out.println("y co-ordinate = ");
        this.y = sc.nextDouble();
    }
}