package com.threads;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueExample {

    TransferQueue<String> queue = new LinkedTransferQueue<String>();

    class ProducerThree implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            for(int i = 0; i < 2; i++){
                try{
                    System.out.println("Producer waiting to transfer: " + i);
                    queue.transfer("" + i);
                    System.out.println("Producer transfered: " + i);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }

    }

    class ConsumerThree implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            for(int i = 0; i < 2; i++){
                try{
                    Thread.sleep(2000);
                    System.out.println("Consumer waiting to comsume: " + i);
                    queue.take();
                    System.out.println("Consumer consumed: " + i);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String args[]){
        TransferQueueExample example = new TransferQueueExample();
        new Thread(example.new ProducerThree()).start();
        new Thread(example.new ConsumerThree()).start();
    }

}
