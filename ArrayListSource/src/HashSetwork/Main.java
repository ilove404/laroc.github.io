package HashSetwork;

import java.util.HashSet;
import java.util.Objects;

//Hashset 作业
public class Main {
@SuppressWarnings("all")
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add(new Employee("shabi", 18, new Mydata(2022, 6, 4))));
        System.out.println(hashSet.add(new Employee("shabi", 18, new Mydata(2022, 6, 4))));
        System.out.println(hashSet.add(new Employee("sha", 18, new Mydata(2022,6,3))));
        System.out.println(hashSet.add(new Employee("shabi", 18, new Mydata(2022,6,3))));

        for (Object o : hashSet) {
            System.out.println(o);
        }





        /*Object o = list.get(j);
        Object o1 = list.get(j + 1);
        if (o.getPrice() > o1.getPrice()){//交换
            list.set(j,o2);
            list.set(j+1,o1);*/

        }
static class Employee {
        private String name;
        private int sal;
        private Mydata day;

    public Employee(String name, int sal, Mydata day) {
        this.name = name;
        this.sal = sal;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(day, employee.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, day);
    }

}
    static class Mydata {
        private int year;
        private int month;
        private int day;

        public Mydata(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public String toString() {
            return "Mydata{" +
                    "year=" + year +
                    ", month=" + month +
                    ", day=" + day +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Mydata mydata = (Mydata) o;
            return year == mydata.year && month == mydata.month && day == mydata.day;
        }

        @Override
        public int hashCode() {
            return Objects.hash(year, month, day);
        }
    }
}



