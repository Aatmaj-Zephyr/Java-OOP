public class circle{
    double r;
    final static double pi = 3.1415963;
    private double circumference;
    private double area;
    circle(double radius){
        this.r = radius;
        this.circumference= circle.pi*2*this.r;
         this.area= circle.pi*this.r*this.r;
    }
    double circumference(){
        return this.circumference;
    }
     double area(){
        return this.area;
    }
}
