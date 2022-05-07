package com.thread;

public class threadMain {
    public static void main(String[] args) {
        //First thread
        Runnable thread1 = () -> {
            //This is thread Body
            for(int i = 1; i <= 10; i++){
                System.out.println("Value of i : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable thread2 = () -> {
          try {
              for(int i = 1; i <= 10; i++){
                  System.out.println(i + " X 2 = " + (i * 2));
                  Thread.sleep(2000);
              }
          }catch (InterruptedException e){
              e.printStackTrace();
          }
        };

        Thread t = new Thread(thread1);
        t.setName("Anu");
        t.start();

        Thread t2 = new Thread(thread2);
        t2.setName("Priya");
        t2.start();
    }
}
