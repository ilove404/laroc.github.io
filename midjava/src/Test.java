public class Test {
//    void a(Student s){
//        s.name="adfafds";
//    }
    {
        System.out.println("这个是代码块");
    }
    static  {
        System.out.println("这是静态代码块");
    }
    public class Inner{
    }
    public static class Inner1{
    }
    //Test.Inner inner = new Test.Inner();外部引用方式

    Student a(Student s){
        s.name="adfafds";
        return s;
    }
    static void speak(String word){

        System.out.println("说点东西："+word);
    }
    int speak(int a,int b){//方法重载，看传入形式类型或者数量或者返回类型，不同就行，

        return a+b;
    }
}
