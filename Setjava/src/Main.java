import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
/*        System.out.println("Hello world!");
//        TestClass<Object> test = new TestClass<>();
//        ArrayList<String> list = new ArrayList<>(100);
        ArrayList<TestClass> list = new ArrayList<>();
        TestClass<String> sudent1 = new TestClass<>("A");
        TestClass<String> sudent2 = new TestClass<>("B");
        list.add(sudent1);
        list.add(sudent2);
        System.out.println((list.get(1).name));
        System.out.println(sudent1.equals(sudent1));*/
/*        LinkedList<String> list = new LinkedList<>();
        list.offer("A");   //入队
        System.out.println(list.poll());  //出队
        list.push("A");
        list.push("B");    //进栈
        list.push("C");
        System.out.println(list.pop());
        System.out.println(list.pop());    //出栈
        System.out.println(list.pop());*/
        List<Integer> list = new LinkedList<Integer>(){
            {    //初始化时添加
                this.add(2);
                this.add(1);
                this.add(4123);

            }
        };
      /*  list.sort((o1, o2) -> {
            return  o1 -o2;
        });
        Collections.sort(list,(o1,o2)->{return o1-o2;});*/
        System.out.println(Collections.max(list, (o1, o2) -> {
            return (String.valueOf(o1)).length() - (String.valueOf(o2)).length();
        }));
        System.out.println(list);
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
        for (Integer i: list
             ) {
            System.out.println(i);
        }
        list.forEach(integer -> {
            System.out.println(integer);
        });
        list.replaceAll(integer -> integer +1);
        System.out.println(list);

        Map<Integer,String> map1 = new HashMap<>();
//        访问顺序，也就是说对于刚访问过的元素，会被排到最后一位。
        map1.put(1,"A");
        map1.put(3,"B");
        map1.put(2,"C");
        System.out.println(map1.get(1));
        System.out.println(map1.getOrDefault(0,"K"));//访问 key 0，值，若无，则返回K“
        map1.remove(1);//移除key，以及对应值

        map1.forEach((integer, s) -> {
            System.out.println(integer +"->" +s);
        });
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");    map.put(2, "B");
        map.compute(1, (k, v) -> {   //compute会将指定Key的值进行重新计算，若Key不存在，v会返回null
             return v+"M";     //这里返回原来的value+M
             });
        map.computeIfPresent(1, (k, v) -> {   //当Key存在时存在则计算并赋予新的值
             return v+"M";     //这里返回原来的value+M
             });
             System.out.println(map);

    }

}
