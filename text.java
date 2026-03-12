import java.util.Scanner;
public class text{
    public static void main(String[] args){



        Scanner abc = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = abc.nextLine();


        System.out.print("enter your age: ");
        int age = abc.nextInt();


        System.out.print("Enter your cgpa: ");
        double cgpa = abc.nextDouble();


        System.out.print("Enter your city: ");
        String city = abc.next();


        System.out.print("Enter your ");

        System.out.println("Your name is " +name  + ". your age is: " +age  + ". your cgpa is " +cgpa  +". your city is " +city );

        abc.close();


    }
}
