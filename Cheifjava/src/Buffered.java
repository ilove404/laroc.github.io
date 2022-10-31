import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Buffered {
    public static void main(String[] args ){
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("test.txt"));//传入FileInputStream
        ){
            System.out.println((char) bufferedInputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
