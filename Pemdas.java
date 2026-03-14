import java.util.Scanner;
public class Pemdas {
    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);

        int a=4;
        a+= 1;
        System.out.println(a);
        a-= 1;
        System.out.println(a);
        a*= 1;
        System.out.println(a);
        a/= 1;
        System.out.println(a);

        a=4+(2*8)/3;
        System.out.println(a);
        // Using PEMDAS [Parentheses(brackets), Exponents(powers), multi,divide,add,sub]//
    }
}
