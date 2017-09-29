package shapes;

abstract public class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);

    public double getLength() {
        return this.length;
    }


    public double getWidth() {
        return this.width;
    }

}

