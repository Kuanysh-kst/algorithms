package day2;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
            System.out.println(nums[i]);
        }
    }
}
