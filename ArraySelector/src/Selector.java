import java.util.Arrays;
/**
 * Defines a library of selection methods
 * on arrays of ints.
 *
 * @author   Isaac Weiss (icw0001@auburn.edu)
 * @version  2020-09-06
 *
 */
public final class Selector {

    private Selector() {

    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 1, 8, 7, 3, 4};
        System.out.println(ceiling(array, 9));

    }

    public static int min(int[] a) {
        if ((a == null) || (a.length < 1)) {
            throw new IllegalArgumentException();
        }
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int max(int[] a) {
        if ((a == null) || (a.length < 1)) {
            throw new IllegalArgumentException();
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int kmin(int[] a, int k) {
        if ((a == null) || (a.length < 1)) {
            throw new IllegalArgumentException();
        }
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
        int[] temp = new int[b.length];
        int numZeros = 0;
        for (int i = 0; i < b.length; i++) {
            if ((i == (a.length - 1)) || (b[i] != b[i + 1])) {
                temp[i] = b[i];
            }
            if (temp[i] == 0) {
                numZeros++;
            }
        }
        int[] temp2 = new int[temp.length - numZeros];
        int j = 0;
        for (int tempIndex = 0; tempIndex < temp.length; tempIndex++) {
            if (temp[tempIndex] != 0) {
                temp2[j] = temp[tempIndex];
                j++;
            }
        }
        if ((k < 1) || (k > temp2.length)) {
            throw new IllegalArgumentException();
        }
        return temp2[k - 1];

    }

    public static int kmax(int[] a, int k) {
        if ((a == null) || (a.length < 1)) {
            throw new IllegalArgumentException();
        }
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
        int[] temp = new int[b.length];
        int numZeros = 0;
        for (int i = 0; i < b.length; i++) {
            if ((i == (a.length - 1)) || (b[i] != b[i + 1])) {
                temp[i] = b[i];
            }
            if (temp[i] == 0) {
                numZeros++;
            }
        }
        int[] temp2 = new int[temp.length - numZeros];
        int j = 0;
        for (int tempIndex = 0; tempIndex < temp.length; tempIndex++) {
            if (temp[tempIndex] != 0) {
                temp2[j] = temp[tempIndex];
                j++;
            }
        }
        if ((k < 1) || (k > temp2.length)) {
            throw new IllegalArgumentException();
        }
        return temp2[temp2.length - k];
    }

    public static int[] range(int[] a, int low, int high) {
        if ((a == null) || (a.length < 1)) {
            throw new IllegalArgumentException();
        }
        int newSize = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] >= low) && (a[i] <= high)) {
                newSize++;
            }
        }
        int[] b = new int[newSize];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] >= low) && (a[i] <= high)) {
                b[j] = a[i];
                j++;
            }
        }
        return b;
    }

    public static int ceiling(int[] a, int key) {
        if ((a == null) || (a.length < 1)) {
            throw new IllegalArgumentException();
        }
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
        if (key > b[b.length-1]) {
            throw new IllegalArgumentException();
        }
        int ceiling = key;
        for (int i : b) {
            if (i >= ceiling) {
                ceiling = i;
                break;
            }
        }
        return ceiling;
    }
    public static int floor(int[] a, int key) {
        if ((a == null) || (a.length < 1)) {
            throw new IllegalArgumentException();
        }
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
        if (key < b[0]) {
            throw new IllegalArgumentException();
        }
        int floor = key;
        for (int i = b.length - 1; i >= 0; i--) {
            if (a[i] <= floor) {
                floor = a[i];
                break;
            }
        }
        return floor;
    }

}

