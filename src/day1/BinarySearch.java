package day1;

public class BinarySearch {


    // another Method
    static void binarySearchItrAnother(int[] arr, int target) {
        int minValue = 0, maxValue = arr.length - 1;

        // This below check covers all cases , so need to check
        // for mid=lo-(hi-lo)/2
        while (maxValue - minValue > 1) {
            int midValue = (maxValue + minValue) / 2;
            if (arr[midValue] < target) {
                minValue = midValue + 1;
            } else {
                maxValue = midValue;
            }
        }
        if (arr[minValue] == target) {
            System.out.println("Found at index " + minValue);
        } else if (arr[maxValue] == target) {
            System.out.println("Found at index " + maxValue);
        } else {
            System.out.println("Not found");
        }
    }

    // Recursive Method
    static int binarySearchRec(int[] arr, int minValue, int maxValue, int target) {
        if (maxValue >= minValue) {
            int midValue = minValue + (maxValue - minValue) / 2;

            // If the element is present at the
            // middle itself
            if (arr[midValue] == target) {
                return midValue;
            }

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[midValue] > target) {
                return binarySearchRec(arr, minValue, midValue - 1, target);
            } else {
                return binarySearchRec(arr, midValue + 1, maxValue, target);
            }
        }

        return -1;
    }

    //Iterative implementation of Binary Search
    static int binarySearchItr(int[] arr, int target) {
        int minValue = 0, maxValue = arr.length - 1;

        while (minValue <= maxValue) {
            int midValue = minValue + (maxValue - minValue) / 2;

            // Check if x is present at mid
            if (arr[midValue] == target) {
                return midValue;
            }

            // If x greater, ignore left half
            if (arr[midValue] < target) {
                minValue = midValue + 1;
            } else{
                maxValue = midValue-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        //binarySearchItrAnother(nums, 12);
        //System.out.println(binarySearchRec(nums, 0, nums.length, 9));
        System.out.println(binarySearchItr(nums,9));
    }
}

