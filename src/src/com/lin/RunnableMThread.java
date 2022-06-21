package com.lin;
/*
Runnable interface is flexible than directly inherit from Thread class.
It enables objects run on many threads.
 */
public class RunnableMThread implements Runnable {

    @Override
    public void run() {
        // run thread
        for (int i = 1; i <= 20; i++) {
            System.out.println("run thread---" + i);
        }

    }

    public static void main(String[] args) {
        RunnableMThread runnableMThread = new RunnableMThread();

        new Thread(runnableMThread).start();

        for (int i = 1; i <= 20; i++) {
            System.out.println("main thread---" + i);
        }
    }


}
