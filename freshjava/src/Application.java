import java.math.BigInteger;

public class Application {
    public static void main (String[] args){
        System.out.println("hello world");
        System.out.println("Hello");
        String str = "hello world";//String是个类，不是关键字。字符串"hello world"是对象
        final int a=10;
        byte b_0=10;//8bit,-128~127,8 进制 017 16进制 0xf.计算机中用补码表示数字
        short b_1=10;//2byte -32768~32769
        int  c = 10;//4byte
        long d0=100000L;//8byte
        char l0= '1'; //2 byte 0-65535 支持所有语言。，16bit A 65  a96
        //char l=1,表示的是unicode表上的1所映射的字符，即是\u0001
        //Java的char采用Unicode编码表
                    //使用Unicode表示就是：\u0000 ~ \uffff
        BigInteger i0=new BigInteger("113131031233450");
        //System.out.println(l);
        //float 单精度浮点型 （32bit，4字节）
        //double 双精度浮点型（64bit，8字节）
        //V = (-1)^S × M × 2^E，浮点数表示规则
        //对于十进制的 5.25 对应的二进制为：101.01，0.25 = 1*2^-2,
        //相当于：1.0101*2^2。所以，S 为 0，M 为 1.0101，E 为 2。
        // 所以，对于浮点类型，最大值和最小值不仅取决于符号和尾数，还有它的阶码。
        byte b = 9;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(d);
        //byte→short(char)→int→long→float→double
        System.out.println("lbw" + "nb");
        int a1 = 7, b1 = 15;
        System.out.println("lbw" + a1 + b1);//println lbw715 字符串
        System.out.println(a1+b1+"lbw");//println 22lbw
        System.out.println(++a1 + ++b1);
            //运算过程，类型转换，从前往后，先入为主，类型
        boolean x = !(a1>b1);
        System.out.println(x);
        //& //按位与，注意，返回的是运算后的同类型值，不是boolean！
        //| //按位或
        //^ //按位异或 0 ^ 0 = 0
        //~ //按位非
        //0101 & 0100 = 0100 （只有同时为1对应位才得1）
        //int a = 7, b = 15;
       // String str = a > b ? "行" : "不行";  // 判断条件(只能是boolean,或返回boolean的表达式) ? 满足的返回值 : 不满足的返回值
        System.out.println("汉堡做的行不行？"+str);  //汉堡做的行不行？不行
        if (a1 > b1){
            System.out.println("今天学习还可");
        }else {
            System.out.println("加油");
        }
        if (a1 > b1){
        } else if (a1 >= b1) {
        }else {
        }//括号内部定义的变量可以在大括号内部使用，出了大括号则失效
        /*
        switch(a){
            case 7:
                //运行xxx
                break;  //break用于跳出switch语句，不添加会导致程序继续向下运行！
            case 15:
                //运行xxx
                break;
            case 24:
                //运行xxx
                break;
        }//switch采用二分思想进行查找（这也是为什么switch只能判断值相等的原因）*/
        for (int a_1=0 ;a_1 <10;a_1++){
            System.out.println("次数"+a_1);
        }
        int i_0 = 0;
        while (i_0 <10){
            i_0++;
            if (i_0==8){
                break;//结束循环，跳出循环内部，循环终止，继续执行程序后边部分
            } else if (i_0==4) {
                continue;//跳过本次循环，continue以下的代码不执行，直接继续从循环体内程序开始部分继续循环
            }
            System.out.println("这是break测试："+i_0);

        }
//        do {
//
//        }while (){
//
//        }
        /*for (;;){
            //无限循环
        }*/
        }
    }

