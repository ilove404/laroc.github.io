public class JavaDuoxiancheng {
    public static void main(String[] args){
        Thread t_1 = new Thread(new Runnable() {//线程初始化
            @Override
            public void run() {
                System.out.println("sfdasfas");
                for (int i = 0; i < 50; i++) {
                    System.out.println("我是一号线程："+i);
                }
            }
        });
        Thread t = new Thread(new Runnable() {
            public void run(){
                System.out.println("我是线程：" + Thread.currentThread().getName());
                //Thread me = Thread.currentThread().获取当前的进程对象
                System.out.println("我正在计算 0-10000 之间所有数的和...");
                int sum = 0;
                while (true){
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("检测到中断");
                        Thread.interrupted();//复位中断标记，程序继续运行。清除中断标记
                        break;
                    }
                }
//                for (int i = 0; i <= 10; i++) {
//                    sum += i;
//                }
//                try {
//                    Thread.sleep(10000);//线程t里，说明线程t先休眠1秒钟
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                for (int i = 0; i < 500; i++) {
//                    System.out.println("我是二号线程：" + i);
//                }

                System.out.println("结果：" + sum);
            }});

//        t1.start();//t1.run是在本线程中执行，并不是创建新线程
        t.start();
        t.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("我是主线程！");
        try {
            Thread.sleep(1000);//放到主线程里，说明主线程先休眠3s
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t1 = new Thread(() -> {
            System.out.println("线程1开始运行！");
            for (int i = 0; i < 50; i++) {
                if(i % 5 == 0) {
                    System.out.println("让位！");
                    Thread.yield();    //
                }
                System.out.println("1打印："+i);
            }
            System.out.println("线程1结束！");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("线程2开始运行！");
            for (int i = 0; i < 50; i++) {
                System.out.println("2打印："+i);
                if (i ==10){
                    try {
                        System.out.println("线程1加入到此线程");
                        t.join();//t2处于等待状态，等待1线程的完成，并不是1加入到线程2.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();

    }


    }

