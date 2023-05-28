package com.companyName;

import java.util.Arrays;

public class d6 {
    /***
     * @Description swap
     * 功能描述:交换数组,数组反转
     * @paramTypes: [int[]]
     * @params: [arr]
     * @return:
     * @auther: qd
     * @date: 2023/5/22 10:48
     */
    public static int[] swap(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=swap(arr1);
        System.out.println("反转后arr="+Arrays.toString(arr2));
    }
}
