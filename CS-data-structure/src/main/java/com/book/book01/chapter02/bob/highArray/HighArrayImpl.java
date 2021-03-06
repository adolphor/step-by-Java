package com.book.book01.chapter02.bob.highArray;

/**
 * Created by Bob on 2016/6/14.
 */
public class HighArrayImpl implements HighArray {

  private long[] arr;
  private int len;

  public HighArrayImpl(int max) {
    arr = new long[max];
    len = 0;
  }

  @Override
  public int size() {
    return len;
  }

  @Override
  public boolean find(long searchKey) {
    for (int i = 0; i < len; i++) {
      if (searchKey == arr[i])
        return true;
    }
    return false;
  }

  @Override
  public void insert(long value) { // 不考虑越界
    arr[len++] = value;
  }

  @Override
  public boolean delete(long value) {

    int temp = -1; // 另外一种方法不需要使用这个中间变量，但是需要考虑是否匹配到的问题，参考demo中的范例
    for (int i = 0; i < len; i++) {
      if (value == arr[i]) {
        temp = i;
        break;
      }
    }

    if (temp != -1) {
      for (int j = temp; j < len; j++) { // 【Attation】：这里是从temp开始，不是从0开始
        if (j < len - 1)  // 【Attation】：最后一个元素是不需要赋值的，直接减少数组大小就可以了，不然可能出现数组越界的BUG
          arr[j] = arr[j + 1];
      }
      len--; // 【Attation】：数量减少要放在for循环外边
      return true;
    }
    return false;
  }
  // 本方法中出现这种问题的原因是？怎么避免？
  // 第一：思路有问题，删除之后进行元素的前移的时候，应该从第temp个元素开始
  // 第二：全局把我不够好，len--应该放在for循环外边，这个要仔细一点

  @Override
  public void display() {
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}
