package com.companyName;

import java.util.Scanner;

public class TestString {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
//        需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
//        最终效果为：156****1234
        TestString ts=new TestString();
        //System.out.println(ts.blockPhoneNumber());
//        ts.filterDirtyWords();
//        ts.topic5();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入一个字符串：");
//        String str = scanner.nextLine();
//        if (isSymmetric(str)) {
//            System.out.println("输入的字符串是对称字符串");
//        } else {
//            System.out.println("输入的字符串不是对称字符串");
//        }
        String str = "12ab,java,cd,Server78";
        String[] arr = str.split(",");
        for (String s : arr) {
            if (!containsDigit(s)) {
                String uppercase = s.toUpperCase();
                System.out.println(uppercase);
            }
        }
    }
    public static boolean containsDigit(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    public  String blockPhoneNumber() {
        System.out.println("请输入一个手机号11位：");
        String str= null;
        try {
            long phoneNumber= sc.nextLong();
            str = String.valueOf(phoneNumber);
            StringBuilder builder=new StringBuilder(str);
            if(str.length()!=11){
                return "输入的不是手机号。";
            }
            return builder.replace(3,7,"****").toString();
        } catch (Exception e) {
            e.getStackTrace();
            return "输入的非数字。";
        }
    }
    public void filterDirtyWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String inputStr = scanner.nextLine();
        String replacedStr = inputStr.replaceAll("TMD", "***");
        System.out.println("替换后的字符串为：" + replacedStr);
    }
    public void topic5() {
        String str = "12ab,java,cd,Server78";
        String[] arr = str.split(",");
        for (String s : arr) {
            if (!s.matches(".*\\d.*")) {
                String uppercase = s.toUpperCase();
                System.out.println(uppercase);
            }
        }
    }
        //请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
        //例如："abcba"、"上海自来水来自海上"均为对称字符串
    //方法一：双指针
        public static boolean isSymmetric(String str) {
            if (str == null || str.length() == 0) {
                return true;
            }
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    //方法二：StringBuilder中的reverse()，对称字符串反转后与原字符串相同
        public static void isSymmetric02(String str) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个字符串：");
            String inputStr = scanner.next();
            StringBuilder builder=new StringBuilder(inputStr);
            String reverse = builder.reverse().toString();
            if(inputStr==reverse){
                System.out.println("对称");
            }else{
                System.out.println("不对称");
            }
    }
}
