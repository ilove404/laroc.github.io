package FileReader_WriteStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        char[] chars = new char[1024];
        int data = 0;
        try (FileReader fileReader = new FileReader("D:/a.txt");
             FileWriter fileWriter = new FileWriter("D:/b.txt",true )){
            while ((data =fileReader.read(chars)) !=-1 ){//inputStream.read(bytes)返回的是实际读取的字节数
                System.out.println(new String(chars,0,data));
//                fileWriter.write('A');
                fileWriter.write("ASDFG",0,"ASDFG".length());
                fileWriter.write(chars,0,data);
            }

//            fileWriter.write(chars,0,chars.length);
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
