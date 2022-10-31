public class Timeer {
    public static void main(String[] args) {
        new TimerTask(() -> System.out.println("我是定时任务！"), 3000).start();   //创建并启动此定时任务
    }

    static class TimerTask{
        Runnable task;
        long time;

        public TimerTask(Runnable runnable, long time){//Runnable runnable,为了让新建的时钟任务初始化。直接输入兰大语句初始化
            this.task = runnable;
            this.time = time;
        }

        public void start(){
            new Thread(() -> {
                try {//while(True){},无限循环任务
                    Thread.sleep(time);
                    task.run();   //休眠后再运行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
