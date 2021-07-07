package com.zh.leetcode.array;


import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

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
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] indexs = new int[2];
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            //如果当前数组中含有余数，则说明相加能得到target
            if(hash.containsKey(nums[i])){
                //则获取当前的i即是其中一个数的下标
                indexs[0] = i;
                //再根据当前的nums[i]也即是之前加入map的key获取之前的那个下标
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        return indexs;
    }

    public static void main(String[] args) {
        TwoSum numSum = new TwoSum();
        int[] ints = numSum.twoSum2(new int[]{2, 11, 23, 62, 5, 34, 22, 11}, 16);
        System.out.println("-----------------------------");
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] twoSum2(int[] nums ,int target){
        int[] indexs = new int[2];

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if(target == nums[i]+nums[j]){
                    indexs[0]=i;
                    indexs[1]=j;
                    return indexs;
                }
            }
        }
        return indexs;
    }

}
