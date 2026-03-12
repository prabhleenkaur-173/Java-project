import java.util.Scanner;
public class AreaTriangle{
    public static void main(String[] args){

        Scanner abc =new Scanner (System.in);

        System.out.print("Enter the height of the triangle : ");
        double height = abc.nextDouble();

        System.out.print("Enter the base of the triangle : ");
        double base= abc.nextDouble();

        double area =0.5*height*base;
        System.out.print("The area of the triangle is: " + area);

        abc.close();




    }
}
