package PrintStream;

import java.io.IOException;
import java.io.PrintStream;

public class PreStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.print("asdf");
        out.write("asdfasdf".getBytes());
        out.close();

        System.setOut(new PrintStream("d:/print.txt"));
        System.out.println("测试字符串");

    }
}
