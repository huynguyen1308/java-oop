package Lab06;
import java.util.Scanner;

public class Cau02 {
    public static void main(String[] args) {
        String myPassword = "huynq1208 ";
        int userInputTimes = 0;

        while (userInputTimes < 3){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Password, Pls!");
            String userInputPass = scanner.nextLine();

            if (userInputPass == null || userInputPass.isEmpty()){
                throw new IllegalArgumentException("String can't be null or empty!");
            }else {
                if (myPassword.equals(userInputPass)){
                    System.out.println("Password is correct");
                    break;
                }else {
                    System.out.println("Password is incorrect");
                    userInputTimes++;
                }
            }
            if (userInputTimes == 3){
                System.out.println("Please try again later 5 minutes!");
            }
        }
    }
}
