import java.util.Scanner;
import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("What is your name? ");
            String name = input.nextLine();
            System.out.println("How old are you? ");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("What is your favorite food");
            String food = input.nextLine();

            System.out.println("Hello " + name);
            System.out.println("You are " + age);
            System.out.println("you like " + food);
    }
}