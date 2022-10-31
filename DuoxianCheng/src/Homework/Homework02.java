package Homework;

public class Homework02 {
    public static void main(String[] args) {
        B a = new B();
        new Thread(a).start();
        new Thread(a).start();
        new Thread(a).start();

    }
    static class A implements Runnable{
        static int money = 10000;
        @Override
        public void run() {
            while (true){
                if (money<=0) break;
                take();
            }
        }
        public synchronized void take(){
            money = money -1000;
            if (money<0) return;
            System.out.println(Thread.currentThread().getName().toString()+"用户，正在取钱。剩余余额："+money);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    static class B implements Runnable{
        static int money1 = 10000;
        @Override
        public void run() {
            while (true){
               synchronized (this) {
                   money1 = money1 - 1000;
                   if (money1 < 0) return;
                   System.out.println(Thread.currentThread().getName().toString() + "用户，正在取钱。剩余余额：" + money1);
               }try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
