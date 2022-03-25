# 转载题解 

https://leetcode-cn.com/problems/longest-univalue-path/solution/yi-pian-wen-zhang-jie-jue-suo-you-er-cha-94j7/

## 一篇文章解决所有二叉树路径问题（问题分析+分类模板+题目剖析）

二叉树路径的问题大致可以分为两类：

1. 自顶向下：从某一个节点开始（不一定是根节点），从上向下寻找路径，到某一个
节点结束（不一定是叶节点）。
   
2. 非自顶向下：从任意节点到任意节点的路径，不需要自顶向下

解题模板：

1. 自顶向下
```
一般路径：
vector<vector<int>>res;
void dfs(TreeNode*root,vector<int>path)
{
    if(!root) return;  //根节点为空直接返回
    path.push_back(root->val);  //作出选择
    if(!root->left && !root->right) //如果到叶节点  
    {
        res.push_back(path);
        return;
    }
    dfs(root->left,path);  //继续递归
    dfs(root->right,path);
}

# **给定和的路径：**
void dfs(TreeNode*root, int sum, vector<int> path)
{
    if (!root)
        return;
    sum -= root->val;
    path.push_back(root->val);
    if (!root->left && !root->right && sum == 0)
    {
        res.push_back(path);
        return;
    }
    dfs(root->left, sum, path);
    dfs(root->right, sum, path);
}
```

2. 非自顶向下

这类问题一般设计一个辅助函数maxpath，调用自身求得
以一个节点为根节点的左侧最长路径 和 右侧路径最长长度，
那么经过该节点的最长路径就是left + right

接着只需要从根节点开始dfs，不断比较更新全局变量即可。

```
int res=0;
int maxPath(TreeNode *root) //以root为路径起始点的最长路径
{
    if (!root)
        return 0;
    int left=maxPath(root->left);
    int right=maxPath(root->right);
    res = max(res, left + right + root->val); //更新全局变量  
    return max(left, right);   //返回左右路径较长者
}
```
