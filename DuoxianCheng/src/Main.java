import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sells sells = new Sells();
        Thread thread1 = new Thread(sells);
        Thread thread2 = new Thread(sells);
        Thread thread3 = new Thread(sells);

        byte[] bytes = new byte[new Random().nextInt(1024 * 200)];
        System.out.println(bytes);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class Sells implements Runnable{
        private static int ticks = 100;
        protected static boolean loop = true;
        @Override
        public void run() {
            while (loop){
                sell();
            }
        }
        public /*synchronized*/ void sell(){
            synchronized (this) {//同步代码块
                if (ticks <= 0) {
                    System.out.println("售票结束");
                    loop = false;
                    return;//不执行return后的方法内容，直接跳出方法
                }
                ;
                try {
                    System.out.println("正在售票ing,目前" + Thread.currentThread().getName() + "剩余票数" + --ticks);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}