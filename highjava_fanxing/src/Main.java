import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Score<Integer> score1 =  new Score<Integer>("数据结构","13131",99);
        Score<Double> score2 =  new Score<Double>("数据结构","13131", 100.0);
        Score<Object> score3 =  new Score<>("数据结构","13131", "良好");
        ArrayList<Integer> integers = new ArrayList<>();
//        String str = (String) score1.score;
//        System.out.println(str);
        Integer str1 = score1.setScore(100);
        Double dou = score2.setScore(99.9);
//        score1.setScore("一般");
        System.out.println(score1.getScore());
        System.out.println(score3.getScore());
        Score.test("aweee");
        Score.test(123);
        Score.test(new int[]{1, 2, 3});
        
    }
}