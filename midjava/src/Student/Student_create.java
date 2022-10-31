package Student;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Student_create {
    private final String name;
    private final int age;//封装
    private Status state;

    public Student_create(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public void setState(Status state) {
        System.out.println("父类的方法");
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return state;
    }

    public abstract void study();
}
