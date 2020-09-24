package com.zh.leetcode.array;


import java.util.*;

/**
 * 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 示例 :
 * <p>
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveDuplicates {
    /**
     * 排序好的数组去重，要求在原位置上进行，考虑采用双指针比较，
     * 1.设置两个指针p，q。其中p为慢指针，q为快指针，每次比较两个指针位置的数字大小
     * 2.当不相等时，p和q同时向后移动，p在新位置上设置之前q所在位置的值，然后继续比较。
     * 3.当相等时q往后移动一位，p保持不动，直到遇见p和q不相等的时候，然后重复操作2
     * 4.最后返回p+1即是新数组的长度。
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                p = p + 1;
                nums[p] = nums[q];
            }
            q++;
        }
        return p + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int integers = removeDuplicates.removeDuplicates(new int[]{1, 2, 3, 3, 4, 4, 4});
        System.out.println(integers);
    }
}
