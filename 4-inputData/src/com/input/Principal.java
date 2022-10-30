package com.input;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            String x,S1,S2,S3;
            int z;
            double d;
            char y;

            System.out.println("Data Input in line: ");
            System.out.println("-----------------------");
            x = sc.next();
            z = sc.nextInt();
            d = sc.nextDouble();
            y = sc.next().charAt(0);

            System.out.println("-----------------------");
            System.out.println("STRING: "+ x);
            System.out.println("INTEGER: "+ z);
            System.out.println("DOUBLE: "+ d);
            System.out.println("CHAR: "+ y);
            sc.nextLine();
            System.out.println("-----------------------");
            System.out.println("Data Input next line: ");
            S1 = sc.nextLine();
            S2 = sc.nextLine();
            S3 = sc.nextLine();
            System.out.println(S1);
            System.out.println(S2);
            System.out.println(S3);
            System.out.println("-----------------------");
            sc.close();
    }
}