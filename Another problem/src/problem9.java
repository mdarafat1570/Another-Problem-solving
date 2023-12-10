public class problem9 {
    public static void main(String[] args) {
        int rows = 4;
        int currentRow = 1;

        while (currentRow <= rows) {
            int asterisks = 1;
            while (asterisks <= currentRow) {
                System.out.print("*");
                asterisks++;
            }
            System.out.println();
            currentRow++;
        }
    }
}
