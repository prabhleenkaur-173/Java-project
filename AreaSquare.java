import java.util.Scanner;
public class AreaSquare{
    public static void main(String[] args){

        Scanner abc = new Scanner (System.in);

        System.out.print("Enter the side of the square: ");
        double side = abc.nextDouble();

        double area =side*side;
        System.out.print("Area of the square " +area);

        abc.close();
    }
}
