import java.util.Scanner;
public class Swap {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number1: ");
        int no1 = sc.nextInt();

        System.out.print("Enter the number2: ");
        int no2 = sc.nextInt();

        no1 = no1+no2;
        no2 = no1-no2;
        no1 = no1-no2;

        System.out.println("no1 : "+no1);
        System.out.println("no2 : "+ no2);

        sc.close();
    }
}

