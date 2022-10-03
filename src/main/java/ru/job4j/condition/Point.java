package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return dist;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 3, 3, 4);
        System.out.println("result (1, 3) to (2, 4) " + result);
    }
}
