package ObjectInput_OutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class OutputStream {
    public static void main(String[] args) throws IOException, Exception, InstantiationException, IllegalAccessException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/object.dat"));
        System.out.println(ois.read());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println(dog.getClass());
        System.out.println(dog);
        ois.close();
        Dog dog1 = (Dog) dog;
        System.out.println(dog1.getName());

        Class<? extends Dog> aClass = dog1.getClass();
//        Dog dog2 = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        name.setAccessible(true);
        name.set(dog1,"ssss");
        System.out.println(name.get(dog1));
        System.out.println(age.get(dog1));
//        System.out.println(name.get(dog2));

//        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
//        for (Constructor<?> declaredConstructor : declaredConstructors) {
//            System.out.println(declaredConstructor);
//        }
        Constructor<? extends Dog> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class);
        Dog kfc = declaredConstructor.newInstance("KFC", 104);
        Method methods = aClass.getMethod("setAge", int.class);
        methods.invoke(kfc,102);
//        System.out.println(dog1.getAge());
        System.out.println(age.get(kfc));



    }
}
