import java.util.Scanner;  //for input//
public class text{
    public static void main(String[] args){
        // public = file  is public
        //main = main function
        // String[] = to store the character

        Scanner abc = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = abc.nextLine();
        // Line for input full name //

        System.out.print("enter your age: ");
        int age = abc.nextInt();

        // nextInt for integer //

        System.out.print("Enter your cgpa: ");
        double cgpa = abc.nextDouble();


        System.out.print("Enter your city: ");
        String city = abc.next();
        // simple next for only one word //

        System.out.print("Enter your ");

        System.out.println("Your name is " +name  + ". your age is: " +age  + ". your cgpa is " +cgpa  +". your city is " +city );

        // This is for add full result in one line //

        abc.close();


    }
}
