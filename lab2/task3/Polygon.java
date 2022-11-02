package lab2.task3;

import java.util.Arrays;

public class Polygon {
    int n;
    Point[] points;

    public Polygon(int n) {
        this.n = n;
        this.points = new Point[n];
    }

    public Polygon(float[] numbers) {
        this(numbers.length / 2);
        int ct = 0;
        for (int i = 0; i < numbers.length; i = i + 2) {
            this.points[ct++] = new Point(numbers[i], numbers[i + 1]);
        }
    }

    public static void main(String[] args) {
        float[] numbers = {1,2,3,4,5,6};
        Polygon polygon = new Polygon(numbers);
        System.out.println(Arrays.toString(polygon.points));
    }
}
