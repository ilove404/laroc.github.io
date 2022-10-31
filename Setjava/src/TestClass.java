public class TestClass <T>{
    String name;
    public TestClass(T t){
        this.name = (String) t;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((TestClass) obj).name);
    }
}
