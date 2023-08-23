package lt.codeacademy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2}; // [1, 2, _] | k = 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // [0, 1, 2, 3, 4, 5 ,_ ,_ ,_ ,_] | k = 5

        System.out.println("Before:");
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        int k1 = removeDuplicates(nums1);
        int k2 = removeDuplicates(nums2);

        System.out.println("\nAfter:");
        System.out.println(Arrays.toString(nums1) + " | " + k1);
        System.out.println(Arrays.toString(nums2) + " | " + k2);
    }

    public static int removeDuplicates(int[] nums) {
        int ptr = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[ptr]) {
                nums[++ptr] = nums[i];
            }
        }

        return ptr + 1;
    }

    public static int removeDuplicates2(int[] nums) {
        var tempArr = Arrays.stream(nums).distinct().toArray();
        System.arraycopy(tempArr, 0, nums, 0, tempArr.length);
        return tempArr.length;
    }
}