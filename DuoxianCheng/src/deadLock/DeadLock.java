package deadLock;

public class DeadLock {
    public static void main(String[] args) {
    DeadLockDemo deadLockDemo1 = new DeadLockDemo(true);
    DeadLockDemo deadLockDemo2 = new DeadLockDemo(false);
    deadLockDemo1.start();
    deadLockDemo2.start();
    }
    static class DeadLockDemo extends Thread{
        static Object o1=new Object();//保证多线程，共享一个对象，这里使用static
        static Object o2=new Object();
        boolean flag;
        public DeadLockDemo(boolean flag){
            this.flag=flag;
        }
        @Override
            public void run(){
                if(flag){
                    synchronized (o1){
                        System.out.println(Thread.currentThread().getName()+"1");
                        synchronized(o2){//这里获得Ii对象的监视权
                            System.out.println(Thread.currentThread().getName()+"2");
                        }
                    }
                } else{
                        synchronized (o2){
                            System.out.println(Thread.currentThread().getName()+"3");
                            synchronized(o1){//这里获得li对象的监视权
                                System.out.println(Thread.currentThread().getName()+"4");
                            }

                        }
                }
            }
    }
}

