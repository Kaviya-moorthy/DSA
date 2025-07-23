class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] combined=new int[m+n];
        for(int i=0;i<m;i++){
            combined[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            combined[m+i]=nums2[i];
        }
        Arrays.sort(combined);
        for (int i = 0; i < m + n; i++) {
            nums1[i] = combined[i];
        }
    }
}