package com.hspedu;

public class Cat {
    public String name = "招财猫";
    public int age = 10;
    public String color="white";

    public Cat(){
    }
    private Cat(String name){
        System.out.println("这是构造器");
        this.name = name;
    }
    public void hi(){
        System.out.println("hi" + name);
    }
    public void cry(){
        System.out.println("喵喵");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
