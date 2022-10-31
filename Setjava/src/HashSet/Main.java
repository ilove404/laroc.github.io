package HashSet;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new LinkedHashSet<>();
        set.add(120);//支持插入，不支持指定位置插入
        set.add(10);
        set.add(16);

        for (Integer integer : set) {
            System.out.println(integer);//hash表的保存方式，并按照hash表输出数字
        }
        set1.add(120);
        set1.add(10);
        set1.add(16);
        for (Integer integer1 : set1) {
            System.out.println(integer1);//按照link的顺序返回值

        }
        TreeSet<Integer> set3 = new TreeSet<>((a, b) -> b - a);   //在创建对象时指定规则即可
        //默认从小到大，输入逻辑：从大到小
         set3.add(1);
         set3.add(3);
         set3.add(2);
         System.out.println(set3);

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(3,"B");
        map.put(2,"C");
        System.out.println(map);

        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>(16,0.75f,true);
//        访问顺序，也就是说对于刚访问过的元素，会被排到最后一位。




    }
    public static void test1(){
        List<String> list = new ArrayList<>();
        list.add("A,B");
        list.add("C,D");
        list.add("E,F");   //我们想让每一个元素通过,进行分割，变成独立的6个元素
        list = list
                .stream()    //生成流
                .flatMap(e -> Arrays.stream(e.split(",")))    //分割字符串并生成新的流
                .collect(Collectors.toList());   //汇成新的List
        System.out.println(list);   //得到结果
    }
    public static void test2(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int sum = list
                .stream()
                .reduce((a, b) -> a + b)   //计算规则为：a是上一次计算的值，b是当前要计算的参数，这里是求和
                .get();    //我们发现得到的是一个Optional类实例，不是我们返回的类型，通过get方法返回得到的值
        System.out.println(sum);


        String str = null;
        Optional<String> optional = Optional.ofNullable(str);   //转换为Optional
        optional.ifPresent(System.out::println);  //当存在时再执行方法



        String str1 = "A";
        Optional optional1 = Optional.ofNullable(str1);   //转换为Optional（可空）
        System.out.println(optional.filter(s -> s.equals("B")).get());   //被过滤了，此时元素为null，获取时报错


        List<String> list2 = new ArrayList<>();
        String str2 = "A";
        Optional optional2 = Optional.ofNullable(str2);   //转换为Optional（可空）
        System.out.println(optional.map(s -> s + "A").get());   //在尾部追加一个A


    }

}
