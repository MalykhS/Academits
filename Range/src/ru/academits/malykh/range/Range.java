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


    public Range[] getIntervalsIntersection(Range range) {
        if (from <= range.to && to >= range.from) {
            if (range.from >= from && range.to <= to) { // 1.7 && 2.6
                return new Range[]{new Range(range.from, range.to)};
            }
            if (range.from < from && range.to <= to) { // 1.7 && -2.3
                return new Range[]{new Range(from, range.to)};
            }
            if (range.from <= from && range.to > to) { // 1.7 && -2.9
                return new Range[]{new Range(from, to)};
            }
            if (range.from > from && range.to > to) { //1.7 && 2.9
                return new Range[]{new Range(range.from, to)};
            }
        }
        return null;
    }

    public Range[] getIntervalsJoin(Range range) {
        if (from <= range.to && to >= range.from) { //1.7 && 3.9
            double min = Math.min(from, range.from);
            double max = Math.max(to, range.to);
            return new Range[]{new Range(min, max)};
        } else if (range.from > to) {
            return new Range[]{new Range(from, to), new Range(range.from, range.to)};
        } else {
            return new Range[]{new Range(range.from, range.to), new Range(from, to)};
        }
    }

    public Range[] getIntervalsDifferences(Range range) {
        if (from <= range.to && to >= range.from) {
            if (range.from > from && range.to > to) {
                return new Range[]{new Range(from, range.from)};
            }
            if (range.from < from && range.to < to) {
                return new Range[]{new Range(range.to, to)};
            }
            if (range.from > from && range.to < to) {
                return new Range[]{new Range(from, range.from), new Range(range.to, to)};
            }
            if (range.from <= from && range.to >= to) {
                return null;
            }
        }
        return new Range[]{new Range(from, to)};
    }

    @Override
    public String toString() {
        return this.from + " " + this.to;
    }
}