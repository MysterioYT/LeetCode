class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num3 = new int[m + n];
        int i;
        for (i = 0; i < m; i++) {
            num3[i] = nums1[i];
        }
        for (i = 0; i < n; i++) {
            num3[i + m] = nums2[i];
        }
        for (i = 0; i < m + n; i++) {
            nums1[i] = num3[i];
        }
        Arrays.sort(nums1);
    }
}