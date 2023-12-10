public class problem3 {
    public static void main(String[] args) {
        //3. Write a program in java to display n terms of natural numbers and their sum.
//Test Data : 7
//
        int number = 0;
        int Addition = 0;
        System.out.print("The first 7 natural number is: ");
        while (number <= 7) {
            System.out.println(number + " ");
            Addition += number;
            number++;
        }
        System.out.println("The Sum of Natural Number upto 7 terms :" + Addition);

    }
}
