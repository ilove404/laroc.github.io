package Student;

public class ArtStudent extends Student_create{
    public ArtStudent(String name,int age){
        super(name,age);
    }
    public void art(){
        System.out.println("我在画画");
    }
    @Override
    public void study() {
        System.out.println("我是艺术生，我在学习");
    }
}
