package zhan;

public class ArrayStack <T> extends AbstractStack<T> {
    private Object[] arr = new Object[10];
    private int size = 0;//当前数组中存在多少个值

    @Override
    public T pop() {
        return (T) arr[(size--)-1];
    }

    @Override
    public void push(T t) {
        if (size >= this.arr.length) {//如果输入的数组比现有的大
            Object[] arr = new Object[this.arr.length + 10];//，则创建一个更大的数组来扩容
            for (int i = 0; i < this.arr.length; i++) {
                arr[i] = this.arr[i];//把原有的数组复制到新的数组内
            }
            this.arr = arr;
        }
        arr[size++]= t;
    }

}
