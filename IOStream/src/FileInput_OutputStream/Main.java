package FileInput_OutputStream;

import sun.awt.windows.WPrinterJob;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int Data1 = 0;
        int Data2 = 0;
        byte[] bytes = new byte[8];
        try(FileInputStream inputStream = new FileInputStream("D:/aa.txt");
            FileOutputStream outputStream = new FileOutputStream("D:/a.txt",true)) {//append在文件后添加写入
            while ((Data2 =inputStream.read(bytes)) !=-1){//inputStream.read(bytes)返回的是实际读取的字节数
                System.out.print(new String(bytes,0,Data2));//0-data2的字节进行构建字符串，0是起始下标
                outputStream.write(bytes,0,Data2);//推荐使用方法进行写入
            }
//            while ((Data1 = inputStream.read()) != -1 ){//读到最后为-1
//                System.out.print((char) Data1);
//            }
            String str ="xixixididid";
//            outputStream.write(str.getBytes());//可以吧字符串->字节数组
            outputStream.write(str.getBytes(),0,str.length());//从0开始数，推荐使用方法
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }


    }

}