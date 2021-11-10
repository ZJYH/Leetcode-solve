package com.zh.leetcode.array.easy;

/**
 * 给定一个初始元素全部为 0，大小为 m*n 的矩阵 M 以及在 M 上的一系列更新操作。
 * <p>
 * 操作用二维数组表示，其中的每个操作用一个含有两个正整数 a 和 b 的数组表示，含义是将所有符合 0 <= i < a 以及 0 <= j < b 的元素 M[i][j] 的值都增加 1。
 * <p>
 * 在执行给定的一系列操作后，你需要返回矩阵中含有最大整数的元素个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * m = 3, n = 3
 * operations = [[2,2],[3,3]]
 * 输出: 4
 * 解释:
 * 初始状态, M =
 * [[0, 0, 0],
 * [0, 0, 0],
 * [0, 0, 0]]
 * <p>
 * 执行完操作 [2,2] 后, M =
 * [[1, 1, 0],
 * [1, 1, 0],
 * [0, 0, 0]]
 * <p>
 * 执行完操作 [3,3] 后, M =
 * [[2, 2, 1],
 * [2, 2, 1],
 * [1, 1, 1]]
 * <p>
 * M 中最大的整数是 2, 而且 M 中有4个值为2的元素。因此返回 4。
 * <p>
 * 注意:
 * <p>
 * m 和 n 的范围是 [1,40000]。
 * a 的范围是 [1,m]，b 的范围是 [1,n]。
 * 操作数目不超过 10000。
 *
 * @author zhanghao
 * @date 2021-11-07
 */
public class SumRange {
    /**
     * 方法一：维护所有操作的交集
     * 思路与算法
     * <p>
     * 对于每一次操作，给定 (a, b)(a,b)，我们会将矩阵中所有满足 0 \leq i < a0≤i<a 以及 0 \leq j < b0≤j<b 的位置 (i, j)(i,j) 全部加上 11。由于 a, ba,b 均为正整数，那么 (0, 0)(0,0) 总是满足上述条件，并且最终位置 (0, 0)(0,0) 的值就等于操作的次数。
     * 因此，我们的任务即为找出矩阵中所有满足要求的次数恰好等于操作次数的位置。假设操作次数为 kk，那么 (i, j)(i,j) 需要满足：
     *
     */
    public int maxCount(int m, int n, int[][] ops) {
        int mina = m, minb = n;
        for (int[] op : ops) {
            mina = Math.min(mina, op[0]);
            minb = Math.min(minb, op[1]);
        }
        return mina * minb;
    }
}