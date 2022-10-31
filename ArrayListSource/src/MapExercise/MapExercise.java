package MapExercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        HashMap<Integer, Employee> map = new HashMap<>();
        map.put(1, new Employee("张三", 18000));
        map.put(2, new Employee("李四", 16000));
        map.put(4, new Employee("王五", 19000));

        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {

        }
        for (Integer integer : integers
        ) {
            Employee value = map.get(integer);
            if (value.price > 18000) System.out.println(value);
        }
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            Employee value1 = map.get(next);
            if (value1.price>18000) System.out.println(value1);
        }

        Set<Map.Entry<Integer, Employee>> entries = map.entrySet();
        for (Map.Entry obj: entries
             ) {
            Employee value3 =(Employee) obj.getValue();
            if (value3.price>18000) System.out.println(obj.getValue());
        }

    }


    static class Employee{
        String name;
        double price;

        public Employee(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
