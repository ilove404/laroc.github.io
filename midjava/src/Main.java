import static com.test.code.Test.a;
import Student.Student_create;
import  Student.*;

import java.util.function.Consumer;


public class Main {//对象基于类创建，类相当于一个模板，对象就是根据模板创建出来的实体
    public static void main(String[] args) {//方法要有返回值
       /* Scanner sc =  new Scanner(System.in);//所有的对象，都需要通过new关键字创建，基本数据类型不是对象！
        //引用类型变量sc代表的是一个对象
//        sc = null; //对象失去了引用，null只有引用类型能使用
        String str = sc.nextLine();//String 是引用类型，则str是引用类型的变量
        System.out.println("输入的符号是："+str);
        sc.close();//在输入后需要手动关闭输入*/
//        Student s = new Student();
//        s.name = "zhangsan";//实际存在的对象才能修改，成员变量属于对象
//        System.out.println(s.name);
        Test c = new Test();
        Student s =new Student("构造方法，初始参数");
        System.out.println(s.name);
        Student k = c.a(s);//类似指针，直接对引用类型的对象进行操作
        //System.out.println(s.name);//上步骤传入s的引用类型，可以直接在Test类中的方法中进行修改，
        System.out.println(k.name);
        c.speak("现在是阴天");
        Student.cons = 100;
        System.out.println(Student.cons);
        String str_1 = "abcd";//str_1是个对象，引用类型
        String str_2 = "abcd";//str_1是个对象，引用类型
//        System.out.println(str_1.toUpperCase());
        System.out.println(str_1.equals(str_2));
        StringBuilder builder = new StringBuilder();
        builder
                .append("a")//返回为StringBuilder
                .append("bc")
                .append("d");   //链式调用
        String str = builder.toString();
        System.out.println(str);
        System.out.println(a);
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};//s数组本身也是类,静态初始化数组
        int[] arr_1 ={1,2,3,4,5,6};
        int[] arr_3 = new int[15];
        arr_3 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        String[] arr2 = new String[a];
        arr_1[0] = 12;
//        System.out.println(arr_1[0]);
        int[] test_arr = new int[12];
//        System.out.println(test_arr.length);
        for (int i = 0; i < arr_1.length; i++) {
            System.out.println(arr_1[i]);
        }
        for (int i:arr) {
            System.out.println(i);
        }
        int[][] arr_n = new int[][]{{1,2},
                                    {3,4},
                                    {5,6}};
        System.out.println(arr_n.length);
        for (int[] i:arr_n
             ) {
            for (int a :i
                 ) {
                System.out.println(a);
            }
        }
        test(1,"1,2,3,4");
        Student_create s_c = new Student_create("lbw", 31) {
            @Override
            public void study() {
                System.out.println("我是抽象方法类，我在学习");
            }
        };
        System.out.println(s_c.getAge());
        System.out.println(s_c.getName());
        ArtStudent s_s = new ArtStudent("lbw",31);
        s_s.art();
        s_s.study();
        System.out.println(s_s.getName());
        Student_create student = new SportStudent("lbw", 20);  //是由SportStudent进行实现的
        student.study();//执行的是子类方法，实现
        SportStudent s1 =(SportStudent) student;
        s1.exercise();
        Eat eat  = new SportStudent("lbw",18);//new出来的对象当做接口实现，类似于类型转换
        //向上转型
        System.out.println(eat instanceof SportStudent);
        SportStudent sp = (SportStudent) eat;
        sp.exercise();
        System.out.println(student instanceof SportStudent);
        System.out.println(student instanceof Student_create);
        class Inner{

        }
        Inner inner = new Inner();//局部内部类
        Eat eat2=new Eat() {//主函数调用接口，匿名内部类，需要对抽象方法具体化
            @Override
            public void eat() {

            }
        };
        A a = i -> i+" ";// Eat eat = () -> {};{}内可以用主体外的变量，final或隐式final
        //int finalC = c
        a.test(1);
        System.out.println(a.test(1));
        //Consumer
        SportStudent student1= new SportStudent("小明", 18);
        student1.setState(Status.SLEEP);
        System.out.println(student1.getStatus().getName());
        Status.valueOf("跑步");
        Status.values();
    }

    private static void test(Student_create student){
        if (student instanceof SportStudent){
            SportStudent sportsStudent = (SportStudent) student;
            sportsStudent.exercise();
        }else if (student instanceof ArtStudent){
            ArtStudent artStudent = (ArtStudent) student;
            artStudent.art();
        }
/*        byte -> Byte
        boolean -> Boolean
        short -> Short
        char -> Character
        int -> Integer
        long -> Long
        float -> Float
        double -> Double*/
        Integer i = 1;   //包装类型可以直接接收对应类型的数据，并变为一个对象！
        //Integer i = Integer.valueOf(int i);
        //-128~127,缓存多个对象，缓存里面去取值对象。不会再生成新的对象new
        System.out.println(i + i);    //包装类型可以直接被当做一个基本类型进行操作！


    }



    private static void test(int a ,String... test){//可变长数组,可变长参数放在最后
        System.out.println(test[0]);    //其实参数就是一个数组
    }
}
//编译器中Main.java
/*public class Main {
    public Main() {像方法，但是又没有返回函数
    }//构造方法，即使你什么都不编写，也自带一个无参构造方法，只是默认是隐藏的

    public static void main(String[] args) {
        Test c = new Test();
        Student s = new Student();
        Student k = c.a(s);
        System.out.println(k.name);
        c.speak("现在是阴天");
    }
}*/
