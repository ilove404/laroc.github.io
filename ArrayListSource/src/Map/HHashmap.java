package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class HHashmap {
    public static void main(String[] args){
        //1,Map与Collection并列存在。用于保存其有映射关系的数据：Key-Valve(双列元素】
        //2,Map中的key和valve可以是任何引用类型的数据，会封装到HashMap$Node对象中
        //3.Map中的key不允许重复，原因和HashSet一样，前面分析过源码,map后替换前的值
        HashMap<Integer,String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1,"abc");
        objectObjectHashMap.put(2,"bc");
        objectObjectHashMap.put(3,"bc");

        Set set = objectObjectHashMap.keySet();
        set.forEach((i)->{
            System.out.println(i+"-"+objectObjectHashMap.get(i));
        });
        Set<Map.Entry<Integer, String>> entries = objectObjectHashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry);
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println(entry1.getKey() + "-" + entry1.getValue());
        }
        System.out.println(objectObjectHashMap.get(3));
        System.out.println(objectObjectHashMap);



    }
}
