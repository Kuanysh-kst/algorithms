package course.lesson3;

import course.lesson3.exceptions.MyArrayDataException;
import course.lesson3.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "3"},
                {"4", "5", "3", "3"},
                {"7", "8", "7", "4"},
                {"7", "8", "7"}
        };
        doMassive(arr);
    }

    private static void doMassive(String[][] arr) {


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr.length == 4 && arr[i].length == 4) {
                    System.out.println("arr.length: [" + arr.length + "], arr[" + i + "]: " + arr[i].length);
                    try {
                        System.out.println(arr[i][j]);
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j, arr);
                    }
                } else {
                    throw new MyArraySizeException();
                }
            }
        }
        System.out.println(sum);
    }
}
