import javax.swing.*;
import java.util.Scanner;

public class Circle {
    class center{
        double myX;
        double myY;

        public center() {
            this(0,0);
        }

        public center(double myX, double myY) {
            this.myX = myX;
            this.myY = myY;
        }

        public double getMyX() {
            return myX;
        }

        public void setMyX(double myX) {
            this.myX = myX;
        }

        public double getMyY() {
            return myY;
        }

        public void setMyY(double myY) {
            this.myY = myY;
        }
    }

    center c = new center();
    double diameter;

    public Circle() {
        this(0,0,0);
    }

    public Circle(double myX, double myY, double diameter) {
        this.new center(myX, myY);
        this.diameter = diameter;
    }

    public void setDiameter(double diameter) {
        try{
            if ( diameter < 0)
                throw new NegativeDiameterException("You have Entered negative value.");
            else
                this.diameter = diameter;
        }
        catch (NegativeDiameterException e)
        {
            System.out.println("Exception has occured");
            System.out.println(e);
        }
    }

    void acceptCircleData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X co-ordinate : ");
        c.setMyX(sc.nextDouble());
        System.out.println("Enter Y co-ordinate : ");
        c.setMyY(sc.nextDouble());
        System.out.println("Enter Diameter : ");
        this.setDiameter(sc.nextDouble());
    }
    @Override
    public String toString() {
        return "Circle [" +
                "Center(x, y) = ("+c.getMyX()+", "+c.getMyY()+")  diameter=" + diameter +
                ']';
    }
}
class NegativeDiameterException extends Exception{
    NegativeDiameterException(String msg){
        super(msg);
    }
}
