import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu calificación: ");
        double nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Sobresaliente");
        }
        else if (nota >= 7) {
            System.out.println("Notable");
        }
        else if (nota >= 5) {
            System.out.println("Sufuciente");
        }
        else {
            System.out.println("Insuficiente");
        }
    }
}