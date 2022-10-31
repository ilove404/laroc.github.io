package homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //指定得到public java.io.File(java.lang.String) Class对象
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        Object o = declaredConstructor.newInstance("d:/aa.txt");
        //得到createNEwFile的方法对象
//        Object o = aClass.newInstance();


        Method createNewFile = aClass.getDeclaredMethod("createNewFile");
        createNewFile.setAccessible(true);
        createNewFile.invoke(o);

    }

  /*  public void homework1() throws Exception{
        Class<?> aClass = Class.forName("homework.PrivateTest");
        Object o = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"caonima");
        Method getName = aClass.getMethod("getName");
        System.out.println(getName.invoke(o));
    }*/

}
