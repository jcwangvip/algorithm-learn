package org.jcm.algorithm.learn.binarysearch;

import org.junit.Assert;
import org.junit.Test;


public class BinarySearchDemo1Test {


    @Test
    public void binarySearch() {
        int[] a = new int[]{1, 3, 5, 7, 9};
        Assert.assertEquals(1, BinarySearchDemo1.binarySearch(a, 3));
        Assert.assertEquals(-1, BinarySearchDemo1.binarySearch(a, 4));
    }

    @Test
    public void leftBinarySearch() {
        int[] a = new int[]{1, 3, 5, 5, 5, 7, 9};
        Assert.assertEquals(1, BinarySearchDemo1.leftBinarySearch(a, 3));
        Assert.assertEquals(-1, BinarySearchDemo1.leftBinarySearch(a, 4));
        Assert.assertEquals(2, BinarySearchDemo1.leftBinarySearch(a, 5));
    }
}