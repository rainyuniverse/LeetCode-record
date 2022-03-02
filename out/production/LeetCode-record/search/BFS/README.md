BFS的适用场景：

1. 利用BFS进行层次遍历
2. 利用BFS求解最短路径问题（Dijkstra 算法解决的是带权最短路径问题，而我们这里关注的是无权最短路径问题）

在利用广度优先遍历算法时，我们通常需要使用队列结构，在java中，可以使用ArrayDeque双端队列数据结构，常见的方法如下所示：

1. addFirst() -在ArrayDeque双端队列的开头，插入指定的元素
2. addLast() - 在ArrayDeque双端队列的末尾插入指定的内容（等效于add()）
3. removeFirst() - 返回并从ArrayDeque双端队列中删除第一个元素（等效于remove()）
4. removeLast() - 返回并从ArrayDeque双端队列中删除最后一个元素
