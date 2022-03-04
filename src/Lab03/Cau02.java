package Lab03;

public class Cau02 {
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5,8, 15};
        int minNumber = intArr[0];
        int maxNumber = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < minNumber) {
                minNumber = intArr[i];
            } else
                maxNumber = intArr[i];
        }
        System.out.println("Min number is: " + minNumber);
        System.out.println("Max number is: " + maxNumber);
    }
}
