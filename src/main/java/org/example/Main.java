package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MyThread extends Thread{
    public void run(){
        int i = 0;
        while(i<20){
            System.out.println("Thread 1 is running ");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<20){
            System.out.println("Thread 1 is running ");
        }
    }
}
class MyThread3 extends Thread{
    public void run(){
        int i = 0;
        while(i<20){
            System.out.println("Thread 1 is running ");
        }
    }
}

class Main{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();

        t1.start();
        t2.start();
        t3.start();
    }
}