import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        // double x;
        // double y;
        // double z;
        
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter side x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        double y = scanner.nextDouble();

        // double z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is " + Math.sqrt((x * x) + (y * y)));// z);

        scanner.close();
    }
}