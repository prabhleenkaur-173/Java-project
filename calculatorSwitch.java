import java.util.Scanner;
public class calculatorSwitch {
    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);

        System.out.print("Enter the no1: ");
        double a = abc.nextDouble();

        System.out.print("Enter the no2: ");
        double b = abc.nextDouble();

        System.out.print("Enter the operator (+,-,*,/,%): ");
        char operator = abc.next().charAt(0);
//.charAt(0) it means char choose the 0th character
// ex: +-*/ so it automatically choose +
        double result = 0;

        switch(operator){
            case '+' : result = a+b; //always put case id that jo user input kre //
                System.out.print("The addition is "+ result);
                break;

            case '-': result = a-b;
                System.out.print("The difference is "+ result);
                break;

            case '*' : result = a*b;
                System.out.print("The multiplication is "+ result);
                break;

            case '/' : result = a/b;
                System.out.print("The division is "+result);
                break;

            case '%' : result =a%b;
                System.out.print("The modulus is "+result);
                break;

            default:
                System.out.print("Invalid");

                abc.close();


        }






    }

}