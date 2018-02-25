/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stiw3054;

/**
 *
 * @author master lab
 */
class MyThread extends Thread {

    public void run() {
        System.out.println("running...new 1");
    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();
        t2.start();
System.out.println("running...new 2");
        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}
