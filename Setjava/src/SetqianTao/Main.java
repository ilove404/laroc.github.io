package SetqianTao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();   //每一个映射都是 字符串<->列表
        map.put("卡布奇诺今犹在", new LinkedList<>());
        map.put("不见当年倒茶人", new LinkedList<>());
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.get("卡布奇诺今犹在").add(100);



    }

    }
