import java.util.Random;
import java.util.Scanner;

public class DiceSimulator {

    public static void main (String[] args){

        Scanner abc = new Scanner(System.in);
        System.out.print( "Enter the no of dice : ");
        int User_input = abc.nextInt();

        Random rd = new Random();
        System.out.println("User rolled ");
        int Total=0;
        int Computer_input =0;
        for(int i=0;i<User_input;i++){
            Computer_input = rd.nextInt(6)+1;
            Total=Total+Computer_input;
            System.out.print(Computer_input);
            System.out.println(" ");
        }
        System.out.println(" total "+Total);
        System.out.println(" ");

    }
}
