import java.util.Random;
public class Dice {
    public static void main(String[] args){

        Random rd = new Random();

        //we can get boolean output by boolean datatype
        boolean isHeads;
        isHeads = rd.nextBoolean();
        System.out.println(isHeads);
        //also we can add if statement to get desired output
        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
