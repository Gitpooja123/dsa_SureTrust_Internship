public class leetCode88 {
    public void MergedArray(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        for (int i=m+n-1; i>=0; i--) {
            if (p2 < 0)
                break;
            if (p1>=0 && nums2[p2] > nums1[p1]) {
                nums1[i] = nums2[p2];
                p2--;
            } else if (p1<0) {       //for edge case
                nums1[i] = nums2[p2];
                p2--;
            } else {
                nums1[i] = nums1[p1];
                p1--;
            }
        }
    }

    public static void main(String[] args) {
        MergeSort s1 = new MergeSort();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        s1.merge(nums1, 3, nums2, 3);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

}
