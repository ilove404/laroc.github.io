public class Sort_some {
    public void Sort_some() {
    }
    public int[] sort(int... arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean tips = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    tips = true;
                }
            }
            if (!tips){
                break;
            }
        }
        return arr;
    }
    public int[] insert_sort(int...arr){
        for (int i = 1; i <arr.length ; i++) {
            int tmp = arr[i];
            int j = i-1;//往前比较
            while (j>=0 && arr[j]>tmp){
                arr[j+1] = arr[j];//满足待比较的牌大于抓拍时，比较的牌往前移
                j--;//往前一直比较
            }arr[j+1]=tmp;
        }
        return arr;
    }
    public int[] select_sort(int... arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_local =i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[min_local]>arr[j]){
                    min_local = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min_local];
            arr[min_local] = tmp;
        }return arr;
    }

}
