package com.mashibing.jvm.c4_RuntimeDataAreaAndInstructionSet;

/**
 * @ClassName TestIntegerAndInt
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/6/15
 * @Version V1.0
 **/
public class TestIntegerAndInt {
    public static void main(String[] args) {
        TestIntegerAndInt test = new TestIntegerAndInt();
        test.m1();
        test.m2();
        test.m3();
        test.m4();
        test.m5();
        test.m6();

    }

    public void m1(){
        Integer i = new Integer(100);
        Integer j = new Integer(100);
        System.out.println(i == j); //false
    }

    public void m2(){
        Integer i = new Integer(100);
        int j = 100;
        System.out.println(i == j); //true
    }

    public void m3(){
        Integer i = new Integer(100);
        Integer j = 100;
        System.out.println(i == j); //false
    }

    public void m4(){
        Integer i = new Integer(128);
        Integer j = 128;
        System.out.println(i == j); //false
    }

    public void m5(){
        Integer i = 100;
        Integer j = 100;
        System.out.println(i == j); //true
    }

    public void m6(){
        Integer i = 128;
        Integer j = 128;
        System.out.println(i == j); //false
    }
}
