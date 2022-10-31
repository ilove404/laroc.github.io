package Threadwork;

import javax.management.relation.RelationNotFoundException;

public class Thread03 {
    public static void main(String[] args){
        Hello hello = new Hello();
        Hi hi = new Hi();
//        hello.start();
//        hi.start();
        System.out.println("main线程继续。。。");
        Thread hello_world = new Thread(new Runnable() {
            int i = 0;
            @Override
            public void run() {
                while (i < 10) {
                    try {
                        i++;
                        System.out.println("hello world"+i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread hi1 = new Thread(hi);
        hello_world.start();
        hi1.start();
    }

    static class Hello extends Thread {
        int i = 0 ;
        @Override
        public void run() {
            while(i<10) {
                try {i++;
                    System.out.println("hello world");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class Hi implements Runnable {
        int i=0;
        @Override
        public void run() {
            while(i<10) {
                try {i++;
                    System.out.println("hi");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    }

