import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args){

        //here we will learn how to generate random numbers
        Random rd = new Random();

        //this is to generate only one random number
        int number;

        number = rd.nextInt();
        System.out.println(number);
//        //so here we will get the output of random number between -ve 2 billion to +ve 2 billion

//        //to overcome this situation set the limits in ()
//        number = rd.nextInt(1,10);   //like if we want numbers between 1 and 10
//        System.out.println(number);

//        //to generate 2 or more random numbers
//        int number1;
//        int number2;
//        int number3;

//        number1 =rd.nextInt(1,8);
//        number2 =rd.nextInt(1,3);
//       number3 =rd.nextInt(3,9);

//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);

//        //to generate a number between 0 and 1 we use decimal
//        double number = rd.nextDouble(0,1);
//        System.out.println(number);  //here no need to specify the limits


    }
}
