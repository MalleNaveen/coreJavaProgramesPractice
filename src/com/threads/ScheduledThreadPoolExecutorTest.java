package com.threads;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorTest {

   public static void main(final String[] arguments) throws InterruptedException {
      final ScheduledThreadPoolExecutor scheduler = 
         (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(1);

      final ScheduledFuture<?> beepHandler = 
         scheduler.scheduleAtFixedRate(new BeepTask(), 2, 2, TimeUnit.SECONDS);

      scheduler.schedule(new Runnable() {

         @Override
         public void run() {
            beepHandler.cancel(true);
            scheduler.shutdown();			
         }
      }, 10, TimeUnit.SECONDS);
   }  

   static class BeepTask implements Runnable {
      
      public void run() {
         System.out.println("naveen");      
      }
   }
}