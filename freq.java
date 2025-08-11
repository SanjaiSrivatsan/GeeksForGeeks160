public class Freq {
    static void frequency(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return;
        }

        int freq = 1;
        int i = 1;

        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);

            i++;
            freq = 1;
        }

        if (n > 1 && arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " " + 1);
        } else if (n == 1) {
            System.out.println(arr[0] + " " + 1);
        }
    }

    public static void main(String[] args) {
        int[] sortedArr = { 10, 10, 20, 20, 20, 30, 40, 40 };
        frequency(sortedArr);
    }
}