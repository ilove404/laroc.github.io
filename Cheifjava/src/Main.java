import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("test.txt");
             FileOutputStream outputStream = new FileOutputStream("Output.txt")
             /*FileInputStream inputStream1 = new FileInputStream("test.txt")*/){
//            System.out.println((char ) inputStream.read());//读取一个a，一个字节往下读，读一个少一个流
//            System.out.println((char) inputStream.read());
//            System.out.println( inputStream.read());//读完时，返回-1
//            System.out.println(inputStream.skip(1));
            System.out.println(inputStream.available());

            byte[] bytes = new byte[10];   //我们可以提前准备好合适容量的byte数组来存放
//            System.out.println(inputStream.read(bytes, 2, 2)); //第二个参数是从给定数组的哪个位置开始放入内容，第三个参数是读取流中的字节数
            /*System.out.println(inputStream.read(bytes));   //一次性读取全部内容（返回值是读取的字节数）,读的内容直接到bytes中去
            outputStream.write(bytes);
            System.out.println(new String(bytes));   //通过String(byte[])构造方法得到字符串*/
            int tmp;
            while ((tmp = inputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,tmp);
                System.out.println((char) tmp);//如果这行也用inputStream进行输入，那么就有两个.read的读取
                //则输出出来的就是跳跃的读取内容
            }

        }catch (IOException e){
            e.printStackTrace();
        }

//        FileInputStream inputStream = null;
        /*try {
            inputStream = new FileInputStream("test.txt");//路径支持相对路径和绝对路径

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (inputStream == null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        /*try (FileOutputStream outputStream = new FileOutputStream("Output.txt",true);){
            outputStream.write("abcd".getBytes());
            outputStream.write('c');
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();*/
        }
//        ObjectOutputStream;


    }