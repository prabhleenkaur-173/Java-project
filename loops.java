import java.util.Scanner;
public class loops {
    public static void main(String[] args){

        Scanner abc = new Scanner(System.in);

        System.out.println("Enter the number: ");
//
//        for(int i=11; i<10 ; i++){
//            System.out.println(i);
//        }

//        int i =0;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }

//        int i=20;
//        do{
//            System.out.println("prabh");
//            i++;
//        }
//        while(i<=10);



//        for(int i=1;i<20 ; i=i*2){
//            System.out.print(i + " ");
//
//        }
//
        int x = abc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.print(x*i + " ");
        }
    }

}
