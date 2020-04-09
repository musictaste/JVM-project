package com.mashibing.jvm.c2_classloader;

public class T008_LazyLoading { //严格讲应该叫lazy initialzing，因为java虚拟机规范并没有严格规定什么时候必须loading,但严格规定了什么时候initialzing
    static {
        System.out.println("主类加载");// 加载--主类初始化
    }

    public static void main(String[] args) throws Exception {
//        P p; //不加载
//        X x = new X(); //加载---父子类初始化
//        System.out.println(P.i); //不加载
//        System.out.println(P.j); //加载---非静态属性初始化
        Class.forName("com.mashibing.jvm.c2_classloader.T008_LazyLoading$P"); //加载---反射初始化 T008_LazyLoading$P是加载内部类P

    }

    public static class P {
        final static int i = 8;
        static int j = 9;
        static {
            System.out.println("P");
        }
    }

    public static class X extends P {
        static {
            System.out.println("X");
        }
    }
}
