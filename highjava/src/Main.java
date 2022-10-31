public class Main {
    public static void main(String[] args) {
        try {
            test(1, 0);   //当b为0的时候，还能正常运行吗？
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

   /* private static int test(int a, int b){
        try {
            int s = a/b;
        }catch (Throwable e){//实例化对象e，ArithmeticException类
//            e.printStackTrace();
            System.out.println("程序出现异常");
        }
        System.out.println("kankannengbuneng继续运行");
        return 0; */  //没有任何的判断而是直接做计算
//        File file = new File("my.txt");
//        try {  file.createNewFile();
//        }
//        catch (IOException e) {
//            //捕获声明的异常类型  e.printStackTrace();}
//
// 出现异常就再往上抛，而不是在此方法内处理
    private static int test(int a, int b) throws Exception {  //声明抛出的异常类型
         if(b == 0) throw new Exception("0不能做除数！");  //创建异常对象并抛出异常,执行至throw，抛出异常，程序停止
        return a/b;
    }
}