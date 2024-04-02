package com.app.geometry;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.*;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this(0,0);
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "Point2D (x, y) = ("+x+", "+y+")";
    }

    public boolean isEqual(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return Double.compare(x, point2D.x) == 0 && Double.compare(y, point2D.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    public double calculateDistance(Point2D p1, Point2D p2)
    {
        double distance = sqrt(pow((p1.x - p2.x),2)+pow((p1.y - p2.y),2));
        return distance;
    }
    public void acceptData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("x co-ordinate : ");
        x = sc.nextDouble();
        System.out.print("y co-ordinate : ");
        y = sc.nextDouble();
    }
}
