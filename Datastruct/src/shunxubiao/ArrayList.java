package shunxubiao;

import shunxubiao.AbstractList;

public class ArrayList<T> extends AbstractList<T> {
    private Object [] arr = new Object[10];
    private int size = 0;//当前数组中存在多少个值
    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T t, int index) {
/**分为3步，
 * 第一步，判断数组是否需要扩容
 * 第二步，将原数组数据迁移至新数组
 * 第三步，将新数组中的index后数据往依次往后移动一位，在index处插入指定数字
* */
        if (index > size) throw new ArrayIndexOutOfBoundsException("非法插入位置");
        if (size >= this.arr.length){//如果输入的数组比现有的大
            Object[] arr = new Object[this.arr.length+10];//，则创建一个更大的数组来扩容
            for (int i = 0; i < this.arr.length; i++) {
                arr[i] =this.arr[i];//把原有的数组复制到新的数组内
            }
            this.arr = arr;
            }
        int i = size -1;//数组最后一位下标索引为数组大小的值-1
        while(i >= index) {
            arr[i+1]= arr[i];
            i--;//将数组最后一位至index的值往后移动一位
        }
        arr[index] = t;//插入数值
        size++;//数组的大小加一。最后一个位置为空
        }

    @Override
    public T remove(int index) {
        if (index >= size) throw new ArrayIndexOutOfBoundsException("非法移除位置");
        //空位置不能删除
        int i = index;  //记录要删除的位置
        T t = (T) arr[index];
        while(i < size-1) {
            arr[i]= arr[i+1];
            i++;//删除之后的位置前移
        }
        size--;
        return t;
        }



    @Override
    public T get(int index) {
        if (index >= size) throw new ArrayIndexOutOfBoundsException("无法访问位置");
        return (T) arr[index];
    }
}
