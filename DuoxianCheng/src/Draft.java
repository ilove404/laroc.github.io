public class Draft {
    public static void main(String[] args) {
        A a = new A();
        Runnable runnable = () -> {
            DeadThread deadThread = new DeadThread();
        };

        Thread thread = new Thread(runnable,"线程1");
        Thread thread1 = new Thread(runnable,"线程2");


        thread1.start();
        thread.start();
    }
    static class A implements Runnable{

        @Override
        public void run() {
            DeadThread deadThread = new DeadThread();
        }
    }

    static class DeadThread{
        static {
            if (true){System.out.println(Thread.currentThread().getName() + "初始化当前类");
                while (true) {

                }
            }
        }

    }
}
