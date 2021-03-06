package com.threads;

import java.util.concurrent.BlockingQueue;

public class ConsumerTwo implements Runnable {

    private final BlockingQueue<Integer> queue;

    @Override
    public void run() {

        try {
            while (true) {
                Integer take = queue.take();
                process(take);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    private void process(Integer take) throws InterruptedException {
        System.out.println("[Consumer] Take : " + take);
        Thread.sleep(500);
    }

    public ConsumerTwo(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
}
