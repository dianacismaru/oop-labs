package lab2.task3;

public class Point {
    float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void changeCoords(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
