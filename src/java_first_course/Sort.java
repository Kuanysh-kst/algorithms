package java_first_course;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        printArray(array);

        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(isSorted);
            printArray(array);
        }

    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int j : array) {
            System.out.print(j + ", ");
        }
        System.out.println("]");
    }
}
