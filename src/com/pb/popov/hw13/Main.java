package com.pb.popov.hw13;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;

public class Main {
    private final static List<Integer> list = new LinkedList<>();

    static class Producer implements Runnable {
        @Override
        public void run() {
            synchronized (list) {
                while (true) {
                    int seconds = new Random().nextInt(100);
                    try {
                        if (list.size() >= 5) {
                            System.out.println("Буфер заполнен");
                            list.wait();
                        }
                        Thread.sleep(100);
                        list.add(seconds);
                        System.out.println(list);
                        list.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            synchronized (list) {
                while (list.size() != 0) {
                    try {
                        Thread.sleep(100);
                        System.out.println(list);
                        list.remove(list.size() - 1);
                        if (list.size() == 0) {
                            System.out.println("Буфер пуст");
                            list.wait();
                        }
                        list.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());
        producer.start();
        consumer.start();
    }
}
