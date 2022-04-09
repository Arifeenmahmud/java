package com.company;


class MyThread extends Thread  {
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }

    }
}
class ca {

}
class MyThread1 extends ca implements Runnable {
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("MyThread 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread1 myThread1 = new MyThread1();
        myThread.start();

        myThread1.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

        }
    }
}

