import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the no.1: ");
        double a =sc.nextDouble();

        System.out.print("Enter the no2: ");
        double b = sc.nextDouble();

        System.out.print("Select the operator(+,-,*,/): ");
        char operator = sc.next().charAt(0);

        double result = 0;

        //Perform operations based on operator
        if(operator == '+'){
            result= a+b;
            System.out.print("The addition is " +result);
        }
        else if(operator == '-'){
            result = a-b;
            System.out.print("The difference is " +result);
        }
        else if(operator == '*'){
            result = a*b;
            System.out.print("The multiplication is " +result);
        }
        else if(operator == '/' ){
            if(b!= 0){
                result = a/b;
                System.out.print("Thr division is "+result);
            }
            else{
                System.out.print("The number is not divided by zero"+result);
            }
        }
        else{
            System.out.print("Invalid");
        }
        sc.close();
    }
}