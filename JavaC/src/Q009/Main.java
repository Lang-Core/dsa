package Q009;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] listOne = {1, 2, 5, 3};
        int[] listTwo = {2, 1, 3, 5};

        boolean status = checkPermutation(listOne, listTwo);
        System.out.println(status);
    }

    public static boolean checkPermutation(int[] listOne, int[] listTwo) {
        boolean isPermutation = listOne.length == listTwo.length;
        Arrays.sort(listOne);
        Arrays.sort(listTwo);
        for (int i = 0; i < listOne.length; i++) {
            if(listOne[i] != listTwo[i]) {
                isPermutation = false;
                break;
            }
        }
        return isPermutation;
    }
}
