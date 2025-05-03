class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] prefix = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        return countWhileMergeSort(prefix, 0, prefix.length, lower, upper);
    }

    private int countWhileMergeSort(long[] prefix, int start, int end, int lower, int upper) {
        if (end - start <= 1) return 0;
        int mid = (start + end) / 2;
        int count = countWhileMergeSort(prefix, start, mid, lower, upper)
                  + countWhileMergeSort(prefix, mid, end, lower, upper);

        int j = mid, k = mid, t = mid;
        long[] temp = new long[end - start];
        int r = 0;

        for (int i = start; i < mid; i++) {
            // Count how many j in [mid, end) satisfy prefix[j] - prefix[i] >= lower
            while (k < end && prefix[k] - prefix[i] < lower) k++;
            // Count how many j in [mid, end) satisfy prefix[j] - prefix[i] <= upper
            while (j < end && prefix[j] - prefix[i] <= upper) j++;
            count += j - k;

            // Merge step (for sorting)
            while (t < end && prefix[t] < prefix[i]) temp[r++] = prefix[t++];
            temp[r++] = prefix[i];
        }
        System.arraycopy(temp, 0, prefix, start, r);
        return count;
    }
}
