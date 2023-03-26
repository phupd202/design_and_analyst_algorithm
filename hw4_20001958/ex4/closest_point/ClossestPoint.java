package hw4_20001958.ex4.closest_point;

import java.util.Arrays;

public class ClossestPoint {
    /*
     * P: sắp xếp theo toạ độ x
     * Q: sắp xếp theo toạ đô y
     */
    public static double closestPoint(Point[] P, Point[] Q) {
        int n = P.length;
        double dMin;

        if(n <= 3) {
            return bruteForce(P);
        } else {
            Point[] Pl = Arrays.copyOfRange(P, 0, n/2);
            Point[] Ql = Arrays.copyOfRange(Q, 0, n/2);

            Point[] Pr = Arrays.copyOfRange(P, n/2, n);
            Point[] Qr = Arrays.copyOfRange(Q, n/2, n);

            double minLeft = closestPoint(Pl, Ql);
            double minRight = closestPoint(Pr, Qr);

            dMin = Math.min(minLeft, minRight);
            double mid = P[n/2].getX();

            Point S[] = new Point[n];

            // copy các điểm xung quang median của Q
            int num = 0;
            for (int i = 0; i < S.length; i++) {
                if(Math.abs(Q[i].getX() - mid) < dMin) {
                    S[num++] = Q[i];
                }
            }

            // tìm min của Các điểm xung quanh median
            int j;
            double dist;
            for (int i = 0; i < num - 1; i++) {
                j = i + 1;
                while(Math.abs((S[i].getY() - S[j].getY())) < dMin && j < num -1) {
                    dist = distance(Q[i], Q[j]);
                    if(dist < dMin) dMin = dist;
                    j++;
                }
            }
            return dMin;
        }
    }

    public static double distance(Point a, Point b) {
        return Math.sqrt( (a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()) );
    }

    public static double bruteForce(Point[] P) {
        int n = P.length;;
        double minDist = distance(P[0], P[1]); 

        for (int i = 0; i < P.length; i++) {
            for (int j = i + 1; j < P.length; j++) {
                if(distance(P[i], P[j]) < minDist) minDist = distance(P[i], P[i]);
            }
        }
        return minDist;
    }

    public static void main(String[] args) {
        Point[] P = new Point[4];

        // create P
        P[0] = new Point(1, 2);
        P[1] = new Point(3, 4);
        P[2] = new Point(9, 6);
        P[3] = new Point(9, 34);

        Point[] Q = Arrays.copyOf(P, P.length);
        Arrays.sort(P, new PointComparatorX());
        Arrays.sort(Q, new PointComparatorY());

        System.out.println(closestPoint(P, Q)); // expect sqrt(8) ứng với điểm P[0] và P[1]

        
    }
}
