import java.util.Scanner;

public class MathPractice {
    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);
        //To find the PYTHAGORAS THEOREM
        double P;
        double B;
        double H;

        System.out.println("Enter the Base: ");
        B=abc.nextDouble();

        System.out.println("Enter the perpendicular: ");
        P=abc.nextDouble();

        H=Math.sqrt(Math.pow(P,2)+Math.pow(B,2));
        System.out.println("The hypotenuse side is : "+H);


    }
}
