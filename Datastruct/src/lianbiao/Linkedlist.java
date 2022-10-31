package lianbiao;

import shunxubiao.AbstractList;

public class Linkedlist<T> extends AbstractList<T> {
    private Node<T> head = new Node<>(null);
    private int size;
    @Override
    public int size() {
        return size;
    }
    /**
     * @param t 元素     *
     * @param index 要添加的位置(索引)
     */
    @Override
    public void add(T t, int index) {
        if (index > size) throw new ArrayIndexOutOfBoundsException("非法插入位置");
        Node<T> node = head ;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        Node<T> tmp;
        tmp = node.next;
        node.next = new Node<T>(t);
        node.next.next = tmp;
        size++;
    }

    @Override
    public T remove(int index) {
        if (index > size-1) throw new ArrayIndexOutOfBoundsException("非法删除位置");
        Node<T> node = head;//节点初始化指向头结点
        for (int i = 0; i < index; i++) {//找到目标节点前驱节点位置
            node = node.next;
        }
        Node<T> tmp = node.next;//输出删除节点的值
        node.next = node.next.next;//将删除目标指向后一节点的引用赋值给前驱节点中指向后一节点的引用。
        size--;
        return tmp.t;
    }

    @Override
    public T get(int index) {
        if (index > +size) throw new ArrayIndexOutOfBoundsException("非法");
        Node<T> node = head;
        for (int i = 0; i < index; i++) {node = node.next;
        }
        return node.t;
    }
    public static class Node<T>{//节点的类
        T t; //节点中的元素
        Node<T> next;//节点中，指向下一个节点的引用
        public Node(T t){
            this.t = t;
        }
    }

}
