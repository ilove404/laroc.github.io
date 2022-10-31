public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{23,2312,3,5,24,21,4};
        Sort_some arr_sort = new Sort_some();
        int[] sort = arr_sort.select_sort(arr);
        for (int i:sort
             ) {
            System.out.print(i+" ");
        }
    }
}