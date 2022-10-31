package ThreadUse;
@SuppressWarnings("all")
public class Threaduse {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.setDaemon(true);
        cat.start();
        /*
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.setName("刘奥");
        thread.start();*/

        for (int i = 0; i < 10; i++) {
            System.out.println("hi" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        thread.interrupt();
//        Tiger tiger = new Tiger();
//        ThreadProxy threadProxy = new ThreadProxy(tiger);
//        threadProxy.start();





    }

    static class Tiger implements Runnable{
        @Override
        public void run() {
            System.out.println("aoaoJiao");
        }
    }

    //模拟代理
    static class ThreadProxy implements Runnable{
        private Runnable target = null;
        public ThreadProxy(Runnable target) {
            this.target = target;
        }
        public void start(){
            start0();
        }
        private void start0() {
            run();
        }
        @Override
        public void run() {
            if (target != null) target.run();//这里的target.run调用的是runnable类的target自己中的run方法
        }

    }
    static class Dog implements Runnable{
        int i =0;
        @Override
        public void run() {
            while (true) {i++;
//                System.out.println("wangwang");
                try {
                    System.out.println(Thread.currentThread().getName().toString()+i);
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("接收到了中断");
                    break;
                }

            }
        }
    }
    static class Cat extends Thread {
        int i =0;
        @Override
        public void run() {
            while (true) {i++;
                System.out.println("miaomiao");
                try {
                    System.out.println(Thread.currentThread().getName().toString());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }


}
