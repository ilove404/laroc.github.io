package ObjectInput_OutputStream;

import java.io.*;
@SuppressWarnings("all")
public class Object_in_outStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/object.dat"));
        oos.write(10);//int->Integer(实现了Serializable)
        oos.writeBoolean(true);//boolean->Boolean(实现了Serializable)
        oos.writeChar('a');//char->Character(实现了Serializable)
        oos.writeDouble(9.5);//double->Double(实现了Serializable)
        oos.writeUTF("韩顺平教育");//String
        //保存一个dog对象
        oos.writeObject(new Dog("旺财",10));
        oos.close();
        System.out.println("数据保存完毕");

    }


}
