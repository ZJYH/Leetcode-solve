package com.zh.leetcode.array.easy;

import javax.sound.midi.Soundbank;
import java.util.Vector;

/**
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 */
public class SearchInsert {

    /**
     * 解法1：双指针天下无敌，遍历数组，时间复杂度O(n)
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int p=0;
        int q=0;
        while(p<nums.length){
            if(target==nums[p]){
                return p;
            }else if(target>nums[p]){
                q=p+1;
            }
            p++;
        }
    return q;
    }

    public static int searchInsert3(int[] nums, int target){

        int q=0;
        while (q<nums.length){

            if(target==nums[q]){
                return q;
            }

            if(target>nums[q]){
                q+=1;
            }

            if(target<nums[q]){
                return q;
            }
        }
        return q;
    }



    /**
     * 解法2：二分法查找插入,时间复杂度O(log n)
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int[] nums, int target) {
        int n =nums.length;
        int left = 0;
        int right =n-1;

        while(left<=right) {
            int mid = left + (right - left) / 2;
            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                left=mid+1;
            }else {
                right =mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] ints = {1, 5, 7, 9};
        System.out.println(searchInsert3(ints, 5));
    }

}
