import java.util.*;

public class Circle {
    double r;
    Circle(double r){
        this.r=r;
    }

    void circumference(){
        double circumference=Math.PI*2*r;
        System.out.println("The Circumference of the circle is "+circumference);
    }

    void Area(){
        double area=Math.PI*Math.pow(r,2);
        System.out.println("The Area of the circle is "+area);
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle");
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        Circle c=new Circle(r);

        c.Area();
        c.circumference();
    }
}
