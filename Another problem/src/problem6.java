import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        //6. Write a program in java while loop to display the multiplication table for a given integer.
        //Test Data :
        //Input the number (Table to be calculated)

        Scanner input = new Scanner(System.in);
        System.out.println("input the number Table to be Claculated :");
        int numbar = input.nextInt();

        int i = 1;
        System.out.println("Multiplication table for "+ numbar+":");
        while (i<=10){
            int result = numbar * i ;
            System.out.println(numbar+" X "+i+ " = "+result);
            i++;
        }
    }
}
