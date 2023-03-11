package day3;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15},result;
        int target = 9;
        result = twoSum(numbers,target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int sum = 0 ,start = 0, end = numbers.length-1;
        int[] temp ;
        while (end != start){
            sum = numbers[start] + numbers[end];
            if (sum > target){
                end--;
            }else if (sum < target){
                start++;
            }else {
                int[] result;
                return result = new int[]{start+1, end+1};
            }
        }
        return temp = new int[]{0, 0};
    }
}
