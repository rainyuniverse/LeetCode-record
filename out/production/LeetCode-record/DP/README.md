动态规划的解题步骤（参考代码随想录）：

1.确定dp数组以及下标的含义

2.确定递推公式

3.dp数组如何初始化

4.确定遍历顺序

5.打印dp数组/举例推导dp数组

以LeetCode第70题爬楼梯为例，分析一下动态规划的五部曲：

1.dp[i]:爬到第i层楼梯，有dp[i]种方法

2.确定递推公式：上到第i-1层楼梯，有dp[i -1]种方法，再走两步就可以到第i层楼梯；上到第i-2层楼梯，有dp[i - 2]种方法，再走一步就可以到第i层楼梯。

于是可以确定递推公式dp[i] = dp[i - 1] + dp[i - 2]

3.dp数组初始化：dp[1] = 1，dp[2] = 2，含义为上到第1层楼梯有1种方法，上到第2层楼梯有2种方法

4.确定遍历顺序：根据递推公式可以发现，是从前往后进行遍历

5.举例推导dp数组
