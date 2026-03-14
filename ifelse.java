import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);

        System.out.print("Enter the age : " );
        int age = abc.nextInt();
        System.out.print("Your age is " +age);
        System.out.println();

        if(age>60){
            System.out.print(" You are senior citizen ");
        }
        else if(age>=18){
            System.out.print(" You are adult");
        }
        else if(age>=0){
            System.out.print(" You are child");
        }
        else if(age==0){
            System.out.print(" You are newborn");
        }
        else{
            System.out.print(" You are not born yet 😏");
        }
         }
}
//