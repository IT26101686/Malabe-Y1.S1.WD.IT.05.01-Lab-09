import java.util.Scanner;

public class IT26101686Lab9Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;
        double x1, x2, discriminant;

        System.out.print("Enter value of a: ");
        a = input.nextDouble();

        System.out.print("Enter value of b: ");
        b = input.nextDouble();

        System.out.print("Enter value of c: ");
        c = input.nextDouble();

        discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant >= 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Root 1 = " + x1);
            System.out.println("Root 2 = " + x2);
        } else {
            System.out.println("No real roots exist.");
        }

        input.close();
    }
}