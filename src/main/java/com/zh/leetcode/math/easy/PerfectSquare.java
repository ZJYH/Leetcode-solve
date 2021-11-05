package com.zh.leetcode.math.easy;

/**
 * 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 *
 * 进阶：不要 使用任何内置的库函数，如  sqrt 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：num = 16
 * 输出：true
 * 示例 2：
 *
 * 输入：num = 14
 * 输出：false
 *  
 *
 * 提示：
 *
 * 1 <= num <= 2^31 - 1
 *
 */
public class PerfectSquare {

    public static void main(String[] args) {

        boolean perfectSquare = isPerfectSquare3(13);
        System.out.println(perfectSquare);
    }


    /**
     * 第一种，内置函数
     * @param num 目标值
     * @return 结果
     */
    public static boolean isPerfectSquare(int num){

        int sqrt = (int) Math.sqrt(num);
        return sqrt*sqrt == num;
    }

    /**
     *第二种，暴力解法寻找
     * @param num 目标值
     * @return 结果
     */
    public static boolean isPerfectSquare2(int num) {

        int a =1;
        while (a * a <num){
            a++;
        }
        return a*a == num;
    }

    /**
     *第三种，二分法寻找
     * @param num 目标值
     * @return 结果
     */
    public static boolean isPerfectSquare3(int num) {

        int left=0;
        int right =num;

        int mid =0;
        while(left<=right){
             mid = (right-left)/2 +left;
             if (right-left ==1) {
                break;
            } else if(mid * mid > num){
                right = mid;
            }else if(mid * mid < num) {
                left = mid;
            }else {
                break;
            }
        }
        return left*left == num || right * right ==num;
    }
}
