package lianbiao;

import shunxubiao.ArrayList;

public class Main {
    public static void main(String[] args){
        Linkedlist<String> list = new Linkedlist<>();
        list.add("ADF",0);
        list.add("DFG",1);
//        System.out.println(list.remove(0));
//        System.out.println(list);
        for (int i = 1; i < list.size()+1; i++) {
            System.out.println(list.get(i));
        }

    }
}
