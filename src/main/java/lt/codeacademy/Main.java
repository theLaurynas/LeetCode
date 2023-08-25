package lt.codeacademy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //<editor-fold desc="Uzduotis 26">
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
        //</editor-fold>

        //<editor-fold desc="Uzduotis 35">
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0));
        //</editor-fold>

    }

    // 26
    public static int removeDuplicates(int[] nums) {
        int ptr = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[ptr]) {
                nums[++ptr] = nums[i];
            }
        }

        return ptr + 1;
    }

    // 26
    public static int removeDuplicates2(int[] nums) {
        var tempArr = Arrays.stream(nums).distinct().toArray();
        System.arraycopy(tempArr, 0, nums, 0, tempArr.length);
        return tempArr.length;
    }

    // 35
    public static int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (target == nums[i]) return i;
            if (target > nums[i] && target <= nums[i + 1]) return i + 1;
        }
        return nums.length;
    }
}