package BufferedRead;

import java.io.*;

public class Buffered_ {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:/a.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:/d.txt"));

        while (( line= bufferedReader.readLine())!=null){//读到null截止
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
    }
}
