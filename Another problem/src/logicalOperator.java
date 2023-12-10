import java.util.Scanner;

public class logicalOperator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        char ch ;

        System.out.println("Enter your Lettar :");
        ch = input.next().charAt(0);

        if (ch == 'a' || ch =='s' || ch =='d' || ch =='f' || ch =='g' ){
            System.out.println("Sir apni Win hoyachen 🔰 ");
        }else  {
            System.out.println("sir Apnar lakey numbar holo ");
        }


    }
}
