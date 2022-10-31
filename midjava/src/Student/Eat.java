package Student;

public interface Eat {//不是一个类，就是一个接口，interface
    public static final int a=10;
    public abstract void eat(); //default 默认实现，在接口中默认实现方法
    //接口内只有函数，没有主题，函数默认abstract，需要在引用后实现，lambda可以实现
}
