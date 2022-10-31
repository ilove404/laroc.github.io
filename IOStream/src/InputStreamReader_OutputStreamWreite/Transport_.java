package InputStreamReader_OutputStreamWreite;

import java.io.*;

public class Transport_ {
    public static void main(String[] args) throws Exception {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/a.txt"),"gbk"));
        BufferedWriter gbk = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/f.txt"), "gbk"));
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
            gbk.write(str);
            gbk.newLine();
        }

        bufferedReader.close();
        gbk.close();
        }
    }

