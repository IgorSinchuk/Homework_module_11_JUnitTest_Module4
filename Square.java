
public class Square {

    public double circle(double radius) {
        return (Math.PI*Math.pow(radius,2));

    }

    public double triangle(double high, double length) {
        return ((high*length)/2);
    }

    public double rectangle(double width, double length){
        return (width*length);
    }
}
