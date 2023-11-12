package 数组;

import 数组.BinarySearch;

class binarySearchTest {

    @org.junit.jupiter.api.Test
    void test() {
        //fail("Not yet implemented");
        BinarySearch s = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19};
        System.out.println(s.search(arr,4));
        System.out.println(s.search(arr2,12));
    }

}