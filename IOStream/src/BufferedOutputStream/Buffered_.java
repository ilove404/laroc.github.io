package BufferedOutputStream;

import java.io.*;
@SuppressWarnings("all")
public class Buffered_ {
    public static void main(String[] args){

        byte[] bytes = new byte[1024];
        int a =0;
        try( BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:/AD2A6007.JPG"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:/asdf.JPG"))) {
            while ( (a =bufferedInputStream.read(bytes)) !=-1){
                bufferedOutputStream.write(bytes,0,a);

            }
            bufferedOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
