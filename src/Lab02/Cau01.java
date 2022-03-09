package Lab02;

import java.util.Scanner;

public class Cau01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height in meter: ");
        float height = scanner.nextFloat();
        System.out.println("Please input your weight in kilogram: ");
        float weight = scanner.nextFloat();
        float BMI = weight/(height * 2);
        System.out.println("Your BMI is:" + BMI);

        if (BMI >= 30) {
            System.out.println("You are obesity");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("You are overweight");
        } else if (BMI > 18.5 && BMI <= 24.9) {
            System.out.println("You're normal weight!");
        } else {
            System.out.println("You are underweight");
        }
    }





}
