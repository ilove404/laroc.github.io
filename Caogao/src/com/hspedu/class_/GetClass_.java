package com.hspedu.class_;

import com.hspedu.Cat;

/**
 *  记录得到Class对象的各种方式（6）种，主要方法4种
 */

/*1.前提：已知一个类的全类名，且该类在类路径下，可通过Cass类的静态方法
        forName()获取，可能抛出ClassNotFoundException,实例：Class cls1=
        Class.forName("java.lang.Cat")
            应用场景：多用于配置文件，读取类全路径，加载类*/

/*2.前提：若已知具体的类，通过类的cass获取，该方式最为安全可靠，程序性能
            最高实例：Class cls2=Cat.class;
            应用场景：多用于参数传递，比如通过反射得到对应构造器对象*/
/* 3.前提：已知某个类的实例，调用该实例的getClass(0方法获取Class对象，实例：
            Class clazz=对象实例.getClass()
            应用场景：通过创建好的对象，获取Classi对象.*/
/*4.其他方式
        ClassLoader cl =对象实例.getClass().getClassLoader();
        Class clazz4=cl.loadClass(“"类的全类名”)i*/
/*5.基本数据(int,char,boolean,float,double,byte,long,short))按如下方式得到Class类对象
        Class cls= 基本数据类型.class;
6.       基本数据类型对应的包装类，可以通过.ype得到Class类对象
        Class cls=包装类.TYPE*/
@SuppressWarnings("All")
public class GetClass_ {
    public static void main(String[] args) throws Exception{
        //1.Class.forName
        Class cls1= Class.forName("com.hspedu.Cat");
        //2.类名.class 应用场景：多用于参数传递
        Class<Cat> catClass = Cat.class;
        System.out.println(catClass);
        //3.对象.getClass()
        Cat cat = catClass.newInstance();
        System.out.println(cat.getClass());

        //4.通过类加载器【4种】来获取类的Class对象
//        （1）先得到类加载器catClass
        ClassLoader classLoader = cat.getClass().getClassLoader();
        //(2)、通过类加载器得到Class对象
        System.out.println(classLoader.loadClass("com.hspedu.Cat"));


    }

}



















