package Hw4_20001958.ex4.closest_point;

import java.util.Comparator;

public class Point implements Comparator<Double> {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {

    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public int compare(Double o1, Double o2) {
        if (o1 > o2) return 1;
        if (o1 < o2) return -1;
        return 0;
    }

}
