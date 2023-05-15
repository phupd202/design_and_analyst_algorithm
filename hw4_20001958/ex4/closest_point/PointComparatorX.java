package Hw4_20001958.ex4.closest_point;

import java.util.Comparator;

public class PointComparatorX implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        if(o1.x > o2.x) return 1;
        if(o1.x < o2.x) return -1;
        return 0;
    }
    
    
}