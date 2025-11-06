package exercise3;

public class Calculator {

    public static int sub(int a, int b){
        System.out.println("\n=== SUBTRACTING 2 INT===");
        System.out.println("Subtracting: "+a+"-"+b);
        return a-b;
    }

    public static int sub(int a, int b, int c){
        System.out.println("\n=== SUBTRACTING 3 INT===");
        System.out.println("Subtracting: "+a+"-"+b+"-"+c);
        return a-b-c;
    }

    public static double sub(double a, double b){
        System.out.println("\n=== SUBTRACTING 2 DOUBLE===");
        System.out.println("Subtracting: "+a+"+3-"+b);
        return a-b;
    }

    public static void main(String[] args) {
        int result1 = sub(21,8);
        System.out.println("Result: " + result1);
        int result2 = sub(7,7,4);
        System.out.println("Result: " + result2);
        double result3 = sub(10.1,6.1);
        System.out.println("Result: " + result3);

        if(result1 == result2){
            System.out.println("\nResults are equal");
            }
        else{
            System.out.println("\nResults are not equal");
        }
    }
}