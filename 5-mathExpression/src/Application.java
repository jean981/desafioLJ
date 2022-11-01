import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,a,b,c;
        double delta,xLine;

        System.out.println("+--------------------------------------+");
        System.out.println("|Calculate the expression: ax²+bx+c = 0|");
        System.out.println("+--------------------------------------+");

        System.out.print("Give a value to a: ");
        a = sc.nextInt();
        System.out.print("\nGive a value to b: ");
        b = sc.nextInt();
        System.out.print("\nGive a value to c: ");
        c = sc.nextInt();
        System.out.println("+--------------------------------------+");
        System.out.printf("\t exrpression: %dx² + %dx + %d = 0 \n",a,b,c);
        System.out.println("+--------------------------------------+");
        System.out.println();

        delta = (Math.pow(b,2)) - (4 * a * c);
        System.out.println("delta = "+delta);

        xLine = (-(b) + Math.sqrt(delta))/(2 * a);
        System.out.println("X1 = "+xLine);

        xLine = (-(b) - Math.sqrt(delta))/(2 * a);
        System.out.println("X2 = "+xLine);


    }
}
