package Lab03;

public class Cau01 {
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5,6};
        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("Even numbers is: " + evenNumbers);
        System.out.println("Odd numbers is: " + oddNumbers);
    }
}
