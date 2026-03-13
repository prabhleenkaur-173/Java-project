import java.util.Scanner;
public class swap{
public static void main(String[] args){

    Scanner abc = new Scanner(System.in);

    // Method 1 (with 3rd variable)
    System.out.print("Enter the 1st number: ");
    int a = abc.nextInt();

    System.out.print("Enter th 2nd number: ");
    int b = abc.nextInt();

    int c = a;
    a = b;
    b = c;

    System.out.println("1st no: " + a);
    System.out.println("2nd no: " + b);



    //Method of (without 3rd variable)

    System.out.print("Enter the first number: ");
    int m = abc.nextInt();

    System.out.print("Enter the second no: ");
    int n = abc.nextInt();

    m = m+n;
    n = m-n;
    m = m+n;

    System.out.println("First no: " + m);
    System.out.print("Second no: " + n);

    abc.close();







}
}
