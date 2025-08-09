class secondLargest {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int first = -1, second = -1;
        if (n < 2) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == -1) {
            return -1;
        }
        return second;
    }
}