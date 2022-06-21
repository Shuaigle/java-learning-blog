package com.lin;

// Not secure
public class BuyTicketMultiThread implements Runnable{

    private int ticketNums = 20;

    @Override
    public void run() {

        while (ticketNums > 0) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println(Thread.currentThread().getName() + " gets " + ticketNums-- + "th ticket");
        }
    }

    public static void main(String[] args) {

        BuyTicketMultiThread ticket = new BuyTicketMultiThread();

        new Thread(ticket, "ace").start();
        new Thread(ticket, "bebe").start();
        new Thread(ticket, "cat").start();
    }
}
