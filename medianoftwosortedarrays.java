/**
 * 
 * Problem 4: Median of Two Sorted Arrays
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the mdeian of the two sorted arrays.
 * The overall run time complexity should be O(long (m+n))
 * 
 */


class Solution {
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] mergedArray = merge(nums1, nums2); // merge and sort arrays
        int length = mergedArray.length;
        double median;

        // find median
        if (length % 2 == 0) {
            median = (mergedArray[length / 2 - 1] + mergedArray[length / 2]) / 2.0;
        } else {
            median = mergedArray[length / 2];
        } 


        return median;

	}
    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k = 0; // i = counter for nums1, j = counter for nums2, k = counter for mergedarray

        // putting in smaller values by comparison
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        // finish putting in the rest of the nums1 and nums2 items left over
        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }
}