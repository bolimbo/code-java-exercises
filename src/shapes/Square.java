package shapes;



class Square extends Rectangle{


    public Square( int wl) {
    super(wl,wl);
    }

    public double getPerimeter(){
        return (4  * super.getWidth());
    }

    public double getArea(){
        return super.getWidth() * super.getLength();
    }



}


