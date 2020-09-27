package com.zh.leetcode.array;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 *示例 :
 *
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 *
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 *
 * 注意这五个元素可为任意顺序。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {

    /**
     * 还是双指针走起，和移除重复元素的差不多，俩个指针，一个快一个慢，当和目标值相等时
     * p不动，q++,当不相等时p，q都向前走一步，并将q所在位置元素交换到p上。
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {

        int p =0;
        int q =0;

        while(q<nums.length){
            if(val!=nums[q]){
                nums[p]=nums[q];
                p++;
            }
            q++;
        }
        return p;
    }
}
