package shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(int w, int l){
        this.width = w;
        this.length = l;
    }

    public double getLength() {
        return  this.length;
    }

    public double getWidth() {
        return this.width;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }
}
