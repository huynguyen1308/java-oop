package Lab03;

import java.util.Arrays;

public class Cau03 {
    public static void main(String[] args) {
        int[] intArr = new int[]{12, 34, 1, 16, 28};

        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++){
                if (intArr[i] > intArr[j]) {
                    int temp = 0;
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}
