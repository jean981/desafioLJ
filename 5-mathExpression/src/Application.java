import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("+--------------------------------------+");
    System.out.println("|Calculate the expression: ax²+bx+c = 0|");
    System.out.println("+--------------------------------------+");

    System.out.print("Give a value to a: ");
    int a = sc.nextInt();
    System.out.print("\nGive a value to b: ");
    int b = sc.nextInt();
    System.out.print("\nGive a value to c: ");
    int c = sc.nextInt();
    System.out.println("+--------------------------------------+");
    System.out.printf("\t exrpression: %dx² + %dx + %d = 0 \n", a, b, c);
    System.out.println("+--------------------------------------+");
    System.out.println();

    double delta = Math.pow(b, 2) - (4 * a * c);
    System.out.println("delta = " + delta);

    System.out.println("X1 = " + calculateX(a, b, c, delta, 1));
    System.out.println("X2 = " + calculateX(a, b, c, delta, -1));
}

private static double calculateX(int a, int b, int c, double delta, int sign) {
    return (-b + sign * Math.sqrt(delta)) / (2 * a);
}
}
