import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
//7. Write a program in java do while loop to display the multiplier table vertically from 1 to n.
//Test Data :
//Input upto the table number starting from 1 :
        Scanner input =new Scanner(System.in);
        System.out.print("Input up to the table number starting from 1: ");
        int n = input.nextInt();

        int multiplier = 1;

        System.out.println("Multiplication table from 1 to " + n);

        do {
            int number = 1;
            do {
                int result = number * multiplier;
                System.out.print(number + "x" + multiplier + " = " + result + ", ");
                number++;
            } while (number <= n);

            System.out.println();
            multiplier++;
        } while (multiplier <= 10);

    }
}
