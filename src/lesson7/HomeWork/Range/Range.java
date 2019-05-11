package lesson7.HomeWork.Range;

public class Range {
    private double from;
    private double to;
    final double epsilon = 1.0e-10;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return this.from;
    }

    public double getTo() {
        return this.to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return this.to - this.from;
    }

    //TODO: сделать парвильную проверку
    boolean isInside(double number) {
        return (number <= this.to) && (number >= this.from);
    }
}
