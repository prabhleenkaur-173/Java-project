import java.util.Scanner;
    public class AreaRectangle {
        public static void main(String[] args){

            Scanner abc = new Scanner(System.in);

            System.out.print("Enter the length of the rectangle : ");
            double length = abc.nextDouble();

            System.out.print("Enter the breadth of the rectangle : ");
            double breadth = abc.nextDouble();

            double area = length * breadth;

            System.out.print("The area of the rectangle is: " + area);

        }
    }

