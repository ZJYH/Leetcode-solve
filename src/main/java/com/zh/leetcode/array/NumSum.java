package com.zh.leetcode.array;


/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class NumSum {

    public int[] twoSum(int[] nums, int target) {

        for (int num : nums) {
            System.out.println(num);
        }

        for(int i=0; i<nums.length;i++){
            int temp = nums[i];
            for (int j=i+1; j<nums.length;j++){
                if(nums[j]+temp==target){
                    System.out.println(nums[j]+temp);

                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        NumSum numSum = new NumSum();
        int[] ints = numSum.twoSum(new int[]{1, 11, 23, 62, 5, 34, 22, 11}, 6);
        System.out.println("-----------------------------");
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

}
