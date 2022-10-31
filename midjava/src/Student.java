public class Student {//public 共有的 class 类 Student 类名 大写字母开头
    String name ;
    int age;//定义和赋值是两个阶段,定义变量时就已经给变量进行了初始化，int初始化是0
    static int cons;//static关键字来声明一个变量或一个方法为静态的，一旦被声明为静态，
    //         那么通过这个类创建的所有对象，操作的都是同一个目标，也就是说，对象再多，也只有这一个静态的变量或方法。
    //标记为静态的内容，会在类刚加载的时候就分配
    public Student() {
    }//默认的构造方法
    public Student(String name){
        this.name = name;//this 指的是new Student,或者 Student s,s这个对象

//        只能在类的成员方法中使用this
    }//重构的构造方法，做初始化的工作。无需返回值
    String test(){//test方法返回的是字符串类型  viod test（）无返回值，主方法不能有返回值
        //方法只能以小写字母开头getNameById()驼峰命名法

        return "done";//执行return后，直接跳出方法，方法执行结束
        //break是结束当前循环体或者判断语句，继续往下执行程序
    }
    int swap(int a,int b){
        int temp = a;
        a =b;
        b= temp;
        return a;

    }

}
