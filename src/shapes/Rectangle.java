package shapes;


public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double l, double w) {
        super(l, w);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }


    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

}
