public class Maths {
    public static void main(String[] args){

        //MATHS EXERCISES

        System.out.println(Math.PI); //this gives the value of pi

        //TO PRINT POWER RAISED
        double result;
        result = Math.pow(2,3);   //--(base,Power)
        System.out.println(result);

        //TO FIND THE MOD
        double MOD;
        MOD = Math.abs(-20);  // .abs = absolute , bracket contain input in which MOD is done
        System.out.println(MOD);

        //TO FIND THE SQUARE ROOT
        double SqRoot;
        SqRoot = Math.sqrt(16); // .sqrt for finding the square root
        System.out.println(SqRoot);

        //TO ROUND OFF ANY NUMBER
        double Roundoff;
        Roundoff = Math.round(12.49);
        System.out.println(Roundoff);

 //       //⭐⭐Most important --TO ROUND OFF UPPER AND LOWER CUT
        double Upround;
        Upround= Math.ceil(12.49); // .ceil --ROUNDS OFF THE NUMBER TO THE UPPER VALUE IT CAN HAVE --(CEILING)
        System.out.println(Upround);

        double Downround;
        Downround =Math.floor(12.49);//floor -- ROUNDS OFF THE NUMBER TO THE LOWER VALUE IT CAN HAVE --(FLOOR)
        System.out.println(Downround);

        //FIND THE MAX AND MIN OUT OF TWO VALUES
        int  max;       // we can use double data type to get the decimal max value
        max=Math.max(12,15);
        System.out.println(max);

        double min;
        min=Math.min(12,15);
        System.out.println(min);
    }

}