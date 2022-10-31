import com.hspedu.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
@SuppressWarnings("All")
public class Main {
    public static void main(String[] args) throws Exception {
//        Cat cat = new Cat();
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println(classfullpath);
        System.out.println(method);

        Class<?> aClass = Class.forName(classfullpath);//加载类
//访问类的信息加载类，直接在引用类型调用方法访问类的信息
        //输出aclass是哪个类的Class对象 com.hspedu.Cat
        System.out.println(aClass);
        //输出aclass运行类型 java.lang.Class
        System.out.println(aClass.getClass());
        //得到包名 com.hspedu
        System.out.println(aClass.getPackage().getName());
        //得到类名 com.hspedu.Cat
        System.out.println(aClass.getName());
        //通过aclass创建对象实例
        Object o = aClass.newInstance();//实例化类对象，返回为？类型引用
        System.out.println(o);


//在使用相应的引用类型.invok/get(对象)来访问
        Field name = aClass.getField("name");
//        name.setAccessible(true);
        System.out.println(name.get(o));
        //图通过反射给属性赋值
        name.set(o,"叮当");
        System.out.println(name.get(o));

        //遍历得到所有的属性
        Field[] fields = aClass.getFields();
        for (Field i:fields
             ) {
            System.out.println("+++++++++");
            System.out.println(i.getName());


        }


        Method method1 = aClass.getMethod(method);//调用方法，即把方法作为了对象
        method1.invoke(o);//执行方法。方法.invoke（对象）


        Field declaredField = aClass.getField("age");
        System.out.println(declaredField.get(o));
//        Field declaredField1 = aClass.getDeclaredField("name");


        Constructor<?> declaredConstructor = aClass.getConstructor();
        System.out.println(declaredConstructor);
        Constructor<?> declaredConstructor1 = aClass.getDeclaredConstructor(String.class);
        declaredConstructor1.setAccessible(true);//反射调用方法或者构造函数式，取消访问权限检测
        System.out.println(declaredConstructor1);

    }
}