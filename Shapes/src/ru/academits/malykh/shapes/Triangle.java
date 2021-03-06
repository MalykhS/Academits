package ru.academits.malykh.shapes;

public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }


    public double getWidth() {
        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }

    public double getHeight() {
        return Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    private static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private double getDistanceA() {
        return getDistance(x1, y1, x2, y2);
    }

    private double getDistanceB() {
        return getDistance(x2, y2, x3, y3);
    }

    private double getDistanceC() {
        return getDistance(x1, y1, x3, y3);
    }

    public double getArea() {
        double getDistanceA = getDistanceA();
        double getDistanceB = getDistanceB();
        double getDistanceC = getDistanceC();
        double semiPerimeter = (getDistanceA + getDistanceB + getDistanceC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - getDistanceA) * (semiPerimeter - getDistanceB) *
                (semiPerimeter - getDistanceC));
    }

    public double getPerimeter() {
        return getDistanceA() + getDistanceB() + getDistanceC();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + getArea() + " " + x1 + " " + y1 + " " + x2 +
                " " + y2 + " " + x3 + " " + y3;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        Triangle otherObj = (Triangle) obj;
        return this.x1 == otherObj.x1 && this.y1 == otherObj.y1 && this.x2 == otherObj.x2 && this.y2 == otherObj.y2 &&
                this.x3 == otherObj.x3 && this.y3 == otherObj.y3;
    }

    @Override
    public int hashCode() {
        int result = 17;
        int n = 37;
        result = result * n + (int) x1;
        result = result * n + (int) y1;
        result = result * n + (int) x2;
        result = result * n + (int) y2;
        result = result * n + (int) x3;
        result = result * n + (int) y3;
        return result;
    }
}