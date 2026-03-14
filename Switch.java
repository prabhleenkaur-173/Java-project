import java.util.Scanner;
public class Switch {
    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);

        System.out.print("Enter the button: ");
        int button = abc.nextInt();

        switch (button){
            case 1 :
            System.out.print("hello");
            break;

            case 2 :
            System.out.print("hey");
            break;

            case 3 :
            System.out.print("hi");
            break;

            default :
            System.out.print("invalid");





        }

    }
}
