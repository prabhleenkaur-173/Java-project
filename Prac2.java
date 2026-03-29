import java.util.Scanner;
public class Prac2 {
   public static void main(String[] args){

       //TO FIND CIRCUMFERENCE , AREA AND VOL OF CIRCLE
       //circumference = 2 * Pi * radius
       //area = Pi * Radius²
       //volume of sphere = 4/3 * Pi * R³

      Scanner abc = new Scanner(System.in);

      double radius;
      double result;

//       System.out.println("Enter the radius : ");
//       radius=abc.nextDouble();
//
//       result = 2 * Math.PI * radius;
//       System.out.println("The circumference of a circle is : "+ result);


//       System.out.println("Enter the radius : ");
//       radius=abc.nextDouble();
//
//       result = Math.PI * Math.pow(radius,2);
//       System.out.println("The area of the circle: " +result);

         System.out.println("Enter the radius : ");
         radius = abc.nextDouble();

         result=(4/3) * Math.PI * Math.pow(radius,3);
         System.out.println("The volume of the sphere : "+ result);



   }
}
