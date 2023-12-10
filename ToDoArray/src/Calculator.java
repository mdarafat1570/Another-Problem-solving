public class Calculator {
    private static final float value1 = 10.0F;
    private static final float value2 = 675.8F;

    public static void main(String[] args) {
        float total = value1 + value2;
        System.out.println("Total Value : " + total);

        if (value1 > value2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

}
