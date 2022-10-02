package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = (x2 - x1);
        double y = (y2 - y1);
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double third = Math.sqrt(first + second);
        return third;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 3, 3, 4);
        System.out.println("result (1, 3) to (2, 4) " + result);
    }
}
