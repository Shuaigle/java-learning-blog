package com.lin;

public class MultiThread extends Thread{
    @Override
    public void run() {
        // run thread
        for (int i = 1; i <= 20; i++) {
            System.out.println("run thread---" + i);
        }
    }

    public static void main(String[] args) {
        // main thread

        // create thread
        MultiThread multiThread = new MultiThread();

        // start and run new thread concurrently
        multiThread.start();

        for (int i = 1; i <= 200; i++) {
            System.out.println("main thread---" + i);
        }
    }
}
