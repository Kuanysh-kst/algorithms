package day2;

public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] nums = {-5, -3, -2, -1}, result, resultAnother;
        resultAnother = sortedSquaresAnotherOne(nums);
        result = sortedSquares(nums);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
        for (int i = 0; i < resultAnother.length; i++) {
            System.out.println(resultAnother[i]);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int value = nums[i];
                    nums[i] = nums[j];
                    nums[j] = value;
                }
            }
        }
        result = nums;
        return result;
    }

    public static int[] sortedSquaresAnotherOne(int[] nums) {
        int n = nums.length, start = 0, end = n - 1;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) > nums[end]) {
                result[i] = nums[start] * nums[start];
                start++;
            } else {
                result[i] = nums[end] * nums[end];
                end--;
            }
        }
        return result;
    }
}
