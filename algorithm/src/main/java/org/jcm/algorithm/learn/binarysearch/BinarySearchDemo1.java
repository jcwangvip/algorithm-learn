package org.jcm.algorithm.learn.binarysearch;

/**
 * 二分查找demo1
 */
public class BinarySearchDemo1 {


    public static int binarySearch(int[] arr, int key) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = i + j >>> 1;
            int midValue = arr[mid];
            if (midValue < key) {
                i = mid + 1;
            } else if (midValue > key) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 最左匹配,不存在返回-1
     *
     * @param arr 升序数组
     * @param key 查询的数字
     * @return 查询数字所属下标
     */
    public static int leftBinarySearch(int[] arr, int key) {
        int i = 0;
        int j = arr.length - 1;
        int m = -1;
        while (i + 1 <= j) {
            int mid = i + j >>> 1;
            int midValue = arr[mid];
            if (midValue < key) {
                i = mid + 1;
            } else if (midValue > key) {
                j = mid - 1;
            } else {
                m = mid;
                j = m;
            }
        }
        return m;
    }

}
