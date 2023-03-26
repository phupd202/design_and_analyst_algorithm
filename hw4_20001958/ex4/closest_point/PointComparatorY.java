package hw4_20001958.ex4.closest_point;

import java.util.Comparator;

public class PointComparatorY implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        if(o1.y > o2.y) return 1;
        if(o1.y < o2.y) return -1;
        return 0;
    }
    
    
}