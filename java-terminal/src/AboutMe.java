import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) {
            try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Enter your name:");
                String name = scanner.next();
                
            System.out.println("Enter your last name:");
                String lastName = scanner.next();
   
            System.out.println("Enter your age:");
                int age = scanner.nextInt();
                
            System.out.println("Enter your height:");
                double height = scanner.nextDouble();

            System.out.println("Hi, my name is " + name + " " + lastName + ".");
            System.out.println("I am " + age + " years old.");
            System.out.println("My height is " + height + "cm.");
        }
    }
}