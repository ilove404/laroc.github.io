package professional;

public abstract class Person  {
    public Status state;
    private String name;
    public Person(String name){
        this.name = name;
    }
    public abstract void eat();
    public abstract void exercise();
    public abstract  void study();
}
