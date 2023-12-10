import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
//1. Write a program in java  to display the first 10 natural numbers. while loops
//        int i = 1;
//        System.out.println("First 10 natural numbers: ");
//        while (i <= 10) {
//            System.out.println(i + " ");
//            i++;
//
//        }
//        int i = 0;
//        System.out.println("first 10 numbar is : ");
//        while (i <= 10){
//            System.out.println(i + "");
//            i++;
//        }

//        int i = 1;
//        int total = 0;
//
//        System.out.println("ay khany 10 numbar holo : ");
//
//        while (i <=100) {
//            System.out.println(i + "  ");
//            i = i + 2;
//            total++;
//
//            System.out.println("Apnar Numbar  : " + total);
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("সংখ্যা প্রবেশ করান: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("এটি জোর সংখ্যা।");
        } else {
            System.out.println("এটি বিজোড় সংখ্যা।");
        }
        }
    }

