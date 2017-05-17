package ru.academits.malykh.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {   //(1,5) && (3,9)
        return number >= from && number <= to;
    }

    public void getIntervalsIntersection(double from, double to) {
        if (from > this.to) {
            System.out.println(java.util.Optional.of(null));
        } else {
            if (to < this.to && from > this.from) {
                System.out.printf("Интервал пересечения равен: (%s, %s)\n", from, to);
            }
            if (to > this.to && from < this.from) {
                System.out.printf("Интервал пересечения равен: (%s, %s)\n", this.from, this.to);
            }
            if (to > this.to && from > this.from) {
                System.out.printf("Интервал пересечения равен: (%s, %s)\n", from, this.to);
            }
            if (to < this.to && from < this.from) {
                System.out.printf("Интервал пересечения равен: (%s, %s)\n", this.from, to);
            }
        }
    }

    public void getIntervalsJoin(double from, double to) {
        if (from < this.to) {
            if (from <= this.from && to >= this.to) { //(1.7) && (-2.9),
                System.out.printf("Интервал объединения равен: (%s, %s)\n", from, to);
            }
            if (from <= this.from && to <= this.to) { // (1.7) && (-2.5)
                System.out.printf("Интервал объединения равен: (%s, %s)\n", from, this.to);
            }
            if (from > this.from && to < this.to) { //1.7 && 2.4
                System.out.printf("Интервал объединения равен: (%s, %s)\n", this.from, this.to);
            }
        }
        if (from == this.to || (from >= this.from && to > this.to)) { // (1.7) && (2.9)
            System.out.printf("Интервал объединения равен: (%s, %s)\n", this.from, to);
        }
        if (from > this.to) {
            System.out.printf("Интервал объединения равен: (%s, %s) и (%s, %s)\n", this.from, this.to, from, to);
        }

    }

    public void getIntervalsDifferences(double from, double to) {
        if (from < this.to) { //1.7 && 3.5
            if (from > this.from && to < this.to) { //&& to < this.to) {
                System.out.printf("Разность интервалов равна: (%s, %s) и (%s, %s)\n", this.from, from, to, this.to);
            }
            if (from > this.from && to > this.to) { //1.7 && 3.9
                System.out.printf("Разность интервалов равна: (%s, %s)\n", this.from, from);
            }
            if (from < this.from && to > this.from) { //1.7 && 0.6
                System.out.printf("Разность интервалов равна: (%s, %s)\n", to, this.to);
            }
        }
        if (from > this.to || to < this.from || this.from == to) {
            System.out.printf("Разность интервалов равна: (%s, %s)\n", this.from, this.to); // 1.7 && -5.0
        }
        if ((from < this.from && to > this.to) || from == this.from || this.to == to ||
                (from == this.from && this.to == to)) {
            System.out.println("Разность интервалов равна пустому множеству!");
        }
    }
}