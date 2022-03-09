package Lab04;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lab04 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        boolean isContinuing = true;

        while (isContinuing = true) {
            System.out.println("=====MENU======");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Option number, please: ");
            int userInput = scanner.nextInt();


            if (userInput == 1) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("1. Add number into List: ");
                int addInput = scanner.nextInt();
                arrayList.add(addInput);
            }

            if (userInput == 2) {
                System.out.println("New Array: " + arrayList);
            }

            if (userInput == 3) {
                System.out.println("Max number: " + Collections.max(arrayList));
            }

            if (userInput == 4) {
                System.out.println("Min number: " + Collections.min(arrayList));
            }

            if (userInput == 5) {
                break;
            }
        }
    }
}
