package day1;

public class FirstBadVersion {

    private static boolean isBadVersion(int n) {
        return n >= 3;
    }

    public static int firstBadVersion(int n) {
        int start = 1, end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = start - 1;
            } else {
                start = mid + 1;
            }
        }
        if (isBadVersion(start)) {
            return start;
        }

        return start + 1;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(3));
    }
}
