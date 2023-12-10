import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {

 //4. Write a program in java while loop to read 10 numbers from the keyboard and find their sum and average.

        Scanner input = new Scanner(System.in);
        int i = 1;
        int sum = 0;


        System.out.println("Sir please tell me your 10 number:");
        while (i <= 10) {
            System.out.print("Number = " + i + " : ");
            int number = input.nextInt();
            sum += number;
            i++;
        }

        double average = (double) sum / 10;

        System.out.println("Sir the sum of the ten numbers given by you is: " + sum);
        System.out.println("After dividing your given numbers by 10 : " + average);
    }
}
