import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        double radius = abc.nextDouble();

        double area = 3.14*radius*radius;
        System.out.print("The area of the circle is : " + area);

        abc.close();




    }
}
