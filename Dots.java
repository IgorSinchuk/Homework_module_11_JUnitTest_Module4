

public class Dots{

    private int x1; //point one
    private int x2; //point two
    private int y1; //point one
    private int y2; //point two
    public Dots(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double distance(){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static void main(String[] args){
       Dots dots = new Dots(-2, -3, 2, 3);
        System.out.println(String.format("%.2f",dots.distance()));
    }
}
