package com.companyName;

import java.util.Scanner;

/**
 *
 */
public class d5 {
    public static Scanner sc=new Scanner(System.in);
    //2.定义一个方法，该方法可以求任意一个三位数的各个位数的立方和。定义并且调用该方法。
    public static void getCubicSum(int threeDigit) {
        int hundred = threeDigit / 100;
        int ten =  (threeDigit / 10) % 10;
        int one =  threeDigit % 10;
        int cubicSum= (hundred*hundred*hundred) + (ten*ten*ten) + (one*one*one);
        System.out.println("三位数立方和为："+cubicSum);
    }
    //3.定义一个方法，该方法可以求1~n的和  。n的值是方法调用时传入

        public static void getNSum(int n) {
            int sum=0;
            for (int i = 1; i <=n ; i++) {
                sum+=i;
            }
            System.out.println("1~n的和为："+sum);
        }
    //4.定义一个方法，该方法可以求数组的平均值 ，具体的数组是方法调用时传入
        public static void getNumAvg(int[] nums) {
            int sum=0;
            for (int i = 0; i <nums.length ; i++) {
                sum+=nums[i];
            }
            System.out.println("数组的平均值为："+sum/nums.length);
        }
    //5.定义方法 完成打印十遍HelloWorld
        public static void sayHelloTenTimes() {
            for(int i = 1; i <=10; i++) {
                System.out.println("Hello, World!");
            }
        }
    //6.定义一个方法,能够完成对比较三个数的最大值,并将最大值打印,三个数要求使用键盘录入
    public static void getMax() {
        int[] nums=new int[3];
        int max=nums[0];
        for(int i = 1; i <=3; i++) {
            System.out.println("请输入第"+i+"个数");
            nums[i-1]=sc.nextInt();
            max=max>nums[i-1]?max:nums[i-1];
        }
        System.out.println("max="+max);
    }
    //7.定义方法,用于计算数组中的最大值和最小值,将最大值和最小值返回
 
    public static void getMaxAndMin(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i = 0; i <nums.length; i++) {
            max=max>nums[i]?max:nums[i];
            min=min<nums[i]?min:nums[i];
        }
        System.out.println("max="+max+",min="+min);
    }
    //8.定义一个方法，该方法可以判断两个数组是否完全一致（长度一致，内容一致，顺序一致，称之为完全一致。）
    // 例如：{1,2,3} 和{1,2,3} 是完全一致的。{1,2,3} 和{3,2,1} 不是完全一致的

    public static boolean ifArrayEquals(int[] nums1,int[] nums2) {
        if(nums1.length!=nums2.length){
            return false;
        }else{
            for(int i = 0; i <nums1.length; i++) {
                if(nums1[i]!=nums2[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
//        //2
//        getCubicSum(689);
//        //3
//        getNSum(100);
//        //4
//        getNumAvg(new int[]{1,2,3});
//        //6
//        getMax();
//        //7
//        getMaxAndMin(new int[]{4,2,3,1});
        //8
        System.out.println(ifArrayEquals(new int[]{4,2,3,3},new int[]{4,2,3,1}));
    }
}
