package Lab02;

import java.util.Scanner;

public class Cau02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number!");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("It is even number");
        } else {
            System.out.println("It is an odd number");
        }
    }
}
