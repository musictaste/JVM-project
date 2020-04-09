package com.mashibing.jvm.c5_gc;

import java.io.IOException;

/**
 * @ClassName T_GC_waiting
 * @Description: TODO
 * @Author 李淼
 * @Date 2020/3/30
 * @Version V1.0
 **/
public class T_GC_waiting {
    public synchronized void m(){
        System.out.println(Thread.currentThread().getName());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        T_GC_waiting o = new T_GC_waiting();
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                o.m();
            },"t"+i);
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
    }
}
