package com.lin;

public class SyncBuyTicket implements Runnable {
    private int ticketNums = 20;

    @Override
    public void run() {

        while (ticketNums > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                buy();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void buy() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " gets " + ticketNums-- + "th ticket");
    }

    public static void main(String[] args) {

        BuyTicketMultiThread ticket = new BuyTicketMultiThread();

        new Thread(ticket, "ace").start();
        new Thread(ticket, "bebe").start();
        new Thread(ticket, "cat").start();
    }
}
