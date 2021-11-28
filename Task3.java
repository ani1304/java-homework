package week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double PI = Math.PI;
        double area  = PI * Math.pow(r,2);
        double perimeter = 2 * PI * r;
        System.out.println(area);
        System.out.println(perimeter);

    }
}
