import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        double a = sc.nextDouble();

        System.out.println("Operación: ");
        String op = sc.next();

        System.out.println("Segundo número: ");
        double b = sc.nextDouble();

        if (op.equals("+")) {
            System.out.println("Resultado: " + (a + b));
        }
        else if (op.equals("-")) {
            System.out.println("Resultado: " + (a - b));
        }
        else if (op.equals("*")) {
            System.out.println("Resultado: " + (a * b));
        }
        else if (op.equals("/")) {
            System.out.println("Resultado: " + (a / b));
        }
    }
}