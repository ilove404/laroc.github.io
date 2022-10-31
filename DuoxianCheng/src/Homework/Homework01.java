package Homework;

import java.util.Scanner;

//import static Homework01.Homework01.Print100.loop;
//import static Homework01.Homework01.ScannerQ.loop;

public class Homework01 {
    public static void main(String[] args) {
        Print100 print100 = new Print100();
//        ScannerQ scannerQ = new ScannerQ();
        Thread thread = new Thread(print100);
//        Thread thread1 = new Thread(scannerQ);
//        thread1.start();
        thread.setDaemon(true);
        thread.start();
        System.out.println("这是主线程");
        Scanner scanner = new Scanner(System.in);
//        char key = ' ';
        while (true){
            System.out.println("输入Q字符");
            char key = scanner.next().toUpperCase().charAt(0);
//            Scanner scanner = new Scanner(System.in);
//            String Q  = scanner.nextLine();
            if (key == 'Q') { //print100.setLoop(false);
                System.out.println(Print100.loop);
////                scanner.nextLine();
                break;}
        }
        System.out.println("这是主线程");
    }

    static class Print100 implements Runnable{
        public static boolean loop = true;

        public void setLoop(boolean loop) {
            this.loop = loop;
        }

        @Override
        public void run() {
            while (loop){
                System.out.println((int) (Math.random()*100+1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
    static class ScannerQ implements Runnable{
        private Print100 A;
        private  Scanner scanner = new Scanner(System.in);

        public ScannerQ(Print100 a) {
            A = a;
        }
        @Override
        public void run() {
            while (true){
                char key = scanner.next().toUpperCase().charAt(0);
                if (key == 'Q') {A.setLoop(false);
                break;}
            }
        }
    }
}
