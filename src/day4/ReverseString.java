package day4;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int count = 0;
        char[] temp = new char[s.length];
        for (int i = s.length-1; i >= 0; i--) {
            temp[count] = s[i];
            count++;
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = temp[i];
        }
    }
}
