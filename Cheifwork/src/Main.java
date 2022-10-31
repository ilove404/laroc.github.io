import org.omg.CORBA.OBJ_ADAPTER;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Main {
    private static List<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        Thread c1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Main.add();
            }
        });
        c1.setName("厨师1");

        Thread c2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Main.add();
            }
        });
        c2.setName("厨师2");
        c1.start();
        c2.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Main.remove();
            }
        });
        t1.setName("顾客1");


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Main.remove();
            }
        });
        t2.setName("顾客2");


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Main.remove();
            }
        });
        t3.setName("顾客3");
        t1.start();
        t2.start();
        t3.start();

    }

    private static void add(){
        while (true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (list) {
                list.add(new Object());
                System.out.println(Thread.currentThread().getName() + "厨师加菜");
                list.notify();
            }
        }

    }

    private  static void remove(){
        while (true){
            synchronized (list) {
                while (list.isEmpty()){
                    try {
                        list.wait();
                        System.out.println(new Date()+Thread.currentThread().getName() + "g顾客吃");
                        list.remove(0);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}