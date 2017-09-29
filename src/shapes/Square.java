package shapes;


public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }


    @Override
    public double getPerimeter() {
        return (4 * super.getWidth());
    }

    @Override
    public double getArea() {
        return super.getWidth() * super.getLength();
    }

}


