package Student;

public class SportStudent extends Student_create implements Eat,Test{
//    public Status status;

    public SportStudent(String name,int age){
        super(name,age);
    //父类的私有属性会继承到子类
    }//
  /*  public void setState(Status state) {
        this.status= state;
    }

    public Status getStatus() {
        System.out.println("子类的方法");
        return status;
    }*/

    public void exercise(){
        System.out.println("我在锻炼");
    }
    @Override//方法重写了
    public void study(){
        System.out.println("我是体育生，对父类抽象类进行的学习方法，进行了具体实现，今天我就是要好好学习");//对父类的方法进行重写

    }

    @Override
    public void eat() {
        System.out.println("体育生在吃东西");
    }
    //public void setTest(int test){
    //    test = 1;
    //  	this.test = 1;//当前类成员变量，对象
    //  	super.test = 1;//指向父类的对象，成员变量，实参
    //}
}
