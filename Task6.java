package week2;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        if (i < 0) {
            i = -i;
        }
        int a = i % 6 + 2;
        System.out.println(a);
    }
    }
