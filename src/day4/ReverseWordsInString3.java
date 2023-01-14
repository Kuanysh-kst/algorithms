package day4;

public class ReverseWordsInString3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWordsAnother(s));
        System.out.println(s);
    }

    public static String reverseWords(String s) {
        char[] result = s.toCharArray();
        int start = 0, end = s.length(), temp = 0;
        while (start < end) {
            if (result[start] == ' ') {
                reverse(result, temp, start - 1);
                System.out.println("temp " + temp + " " + "start " + start);
                temp = start + 1;
            }
            start++;
        }
        System.out.println("tempOut " + temp + " " + "startOut " + start + " " + "end " + end);
        reverse(result, temp, end - 1);
        return new String(result);

    }

    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static String reverseWordsAnother(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(words.length);
        for (int i = words.length-1; i >= 0; i--) {
            if (words[i].length()!=0){
                if (result.length() != 0) {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }
        return result.toString();
    }
}
