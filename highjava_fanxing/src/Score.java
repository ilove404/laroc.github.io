//public class Score <T extends  Number>{//需要创建对象后才能知道对象的类型
public class Score<T> implements Scoreinterface<T>{
    private final String name;
    private final String id;
    private   T score;  //因为Object是所有类型的父类，因此既可以存放Integer也能存放String
    public Score(String name, String id, T score) {
        this.name = name;
        this.id = id;
        this.score = score;    }

    public T setScore(T score) {
        return this.score = score;
    }

    public T getScore() {
        return score;
    }

    public static <R> void test(R e) {
        System.out.println(e);
    }

    @Override
    public T getscore() {
        return null;
    }

    @Override
    public void setscore(T t) {

    }
}

