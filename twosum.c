/**

Problem 1: Two Sums
Brute Force Method

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

 */

 /**
 Note: The returned array must be malloced, assume caller calls free().
  */

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {

    int i=-1, j, temp1, temp2;
    bool matched = false; // if the indices of the numbers summing to target is found

    while (i < numsSize && !matched) { // traverse entire array while indices have not been found
        i++;
        temp1 = nums[i];

        for (j=0; j < numsSize; j++) {
            if (i != j) { // cannot use same element twice
                temp2 = nums[j];

                if (temp1 + temp2 == target) { // if the numbers that sum up to target is found
                    matched = true;
                    break;
                }
            }
        }
    }

    // initialize return array
    *returnSize = 2;
    int * sol = (int*) malloc(*returnSize * sizeof(int));

    sol[0] = i;
    sol[1] = j;

    return sol;

}