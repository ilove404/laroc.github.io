import professional.Person;
import professional.behavior.Test;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 4, 5, 6, 7, 10, 12, 14, 20, 22, 26, 19};
//        int k = binary_search(14,arr);
//        System.out.println(k);
        int[] i1 = new int[5];
        for (int a:i1
        ) {
            System.out.println(a);
        }
        int[] arr1 = new int[]{1,5,7,6,3,1,2,4,0,126,20,34,56,89,44,12,47,56,36};
        for (int i:
        quick_sort(0,arr1.length-1,arr1)) {
            System.out.print(i+" ");
        } ;
    }
    private static void test(Person person){
        if (person instanceof Test){
            Test t = (Test) person;
            t.test();
        }

    }
    private static int binary_search(int val,int... arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right ) / 2;
            if (arr[mid] == val) return mid;
            else if (arr[mid] < val) left = mid + 1;
            else if (arr[mid] > val) right = mid - 1;
        }
        return -1;
    }
    private static int partition(int left,int right,int... arr){

        int tmp = arr[left];
        while (left <right){
            while (left <right && arr[right]>=tmp){
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left]<=tmp){
                left++;
            }
            arr[right] = arr[left];
            }
        arr[left] = tmp;
        return left;
        }
    private static int[] quick_sort(int left,int right,int... arr){
        if (left <right){
            int mid= partition(left,right,arr);
            quick_sort(left,mid-1,arr);
            quick_sort(mid+1,right,arr);
        }
        return arr;
    }
    static int [] w = {2, 3, 4, 5};
    static int [] v = {3, 4, 5, 6};
    static int  number = 4, capacity = 8;
    public static int test(int index,int weight){
        if (index >=4) return 0;
        if (capacity < weight + w[index]) return 0;
        return  Math.max(v[index]+test(index+1,weight +w[index]),test(index+1,weight));
    }

}