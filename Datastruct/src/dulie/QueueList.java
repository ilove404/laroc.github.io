package dulie;

public class QueueList<E> extends  AbstractQueue<E>{
    private Object[] arr = new Object[20];
    private int head = 0,tail = 0;

    @Override
    public void offer(E e) {
        int next = (tail +1)%arr.length;
        if (next == head)return;
        arr[tail] = e;
        tail = next;
    }

    @Override
    public E poll() {
        E e = (E) arr[head];
        head = (head+1)%arr.length;
        return e;
    }
}
