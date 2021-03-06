# 第八章
* 为什么使用二叉树
* 树的术语
* 类比
* 二叉搜索树如何工作
* 查找节点
* 插入节点
* 遍历树
* 查找最大值和最小值
* 删除节点
* 二叉树的效率
* 用数组表示树
* 重复关键字
* 完整的tree.java程序
* 哈夫曼编码


# 01. 为什么使用二叉树
因为二叉树结合了有序数组和链表的有点，
查找时和有序数组一样快，新增和删除时和链表一样快

# 02. 树的术语
二叉树的节点最多有两个子节点。
路径：连接节点的边
根：根节点，只有一个根
父节点：
子节点：分为左子节点、右子节点，且左小右大
叶节点：没有子节点的节点称为“叶节点”，可以有很多“叶节点”
子树：从一个子节点往下所有的子孙构成一个子树
访问：
遍历：遵循某种特定顺序访问所有节点
层：从根节点开始到这个节点有多少代
关键字：对象中包含的一个数据域



# 03. 类比
分级文件结构和树的类比

# 04. 二叉搜索树如何工作
applets:
appletviewer src/main/java/com/book/book01/chapter08/applets/Tree/Tree.html


# 05. 查找节点
从根开始，如果比根小走左边的那条路线，如果比根大，走右边的那条路线；
直至找到对应的数据为止。

# 06. 插入节点
插入节点和查找节点的前面的步骤一直，都要先找到那个需要操作的节点的位置，
查找结点如果找不到直接返回null，插入节点会将输入插入到那个位置。

# 07. 遍历树
遍历树有三种方法：前序，中序，后序。
最常用的是中序遍历。

# 08. 查找最大值和最小值
最小值：最底层的左边的节点就是最小值；
最大值：同理，最右边的子节点

# 09. 删除节点
有三种个情况需要考虑：
1.此节点是叶节点：直接删除；
2.有一个子节点：直接挂在父节点上；
3.有两个子节点：找后继节点挂载。


# 10. 二叉树的效率
O(logN)

# 11. 用数组表示树
用数组中的下标来表示节点在树中的位置，无论是否有值都要占用存储空间；
优点是查找索引值很快，确定是浪费空间。

# 12. 重复关键字
前面都么有考虑重复关键字的问题，如果要完善，需要继续改进方法。

# 13. 完整的tree.java程序
tree

# 14. 哈夫曼编码
一种压缩方法，使用二叉树进行编码和解码。

小结：
* 树由边（直线）连接的节点（圆）组成
* 根是树中最顶端的节点：它没有父节点。
* 二叉树中，节点最多有两个子节点。
* 二叉搜索树中，所有A节点左边子孙节点的关键字值都比A小，所有右边子孙节点的关键字值都比A大（或相等）
* 树执行查找、插入、删除的时间复杂度都是O(logN)
* 节点表示保存在树中的数据对象
* 程序中通常用节点到子节点的引用来表示边（有时也用到节点的父节点的引用）
* 遍历树是按照某种顺序访问树种所有的节点
* 最简单的遍历方法是前序，中序和后序
* 非平衡树是指左右两边的后代不相等
* 插入需要先找到要插入的新节点的位置并改变它父节点的子字段来指向它
* 前序和后序遍历对解析代数表达式是有用的
* 如果一个节点没有子节点，删除它只需要把它的父节点的子字段置为null即可
* 如果一个节点有要给子节点，删除它只需要把父节点的子字段置为它的子节点即可
* 如果有两个子节点，则需要用他的后继来代替它
* 在计算机存储时可以使用数组表示树，不过基于引用的方法更常用
* 哈夫曼树是二叉树（但不是二叉搜索树），用于数据压缩
