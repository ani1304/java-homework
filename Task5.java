package week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i >=18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");

        }

    }
}
