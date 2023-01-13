package day3;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZeroes(nums);
    }

    //own
    public static void moveZeroes(int[] nums) {
        int count = 0;
        int[] temp = new int[nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != 0) {
                temp[count] = nums[i];
                count++;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
