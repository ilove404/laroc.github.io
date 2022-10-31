import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
            List<Student> students = Arrays.asList(
                    new Student("yoni", "English", 80),
                    new Student("yoni", "Chiness", 98),
                    new Student("yoni", "Math", 95),
                    new Student("taohai.wang", "English", 50),
                    new Student("taohai.wang", "Chiness", 72),
                    new Student("taohai.wang", "Math", 41),
                    new Student("Seely", "English", 88),
                    new Student("Seely", "Chiness", 89),
                    new Student("Seely", "Math", 92));
            Map<String, Integer> scoreMap = new HashMap<>();
            students.forEach(i -> scoreMap.merge(i.getName(), i.getScore(), (a,b)->a+b));
            scoreMap.forEach((k, v) -> System.out.println("key:" + k + "总分" + "value:" + v));
        }

    static class Student {
        private final String name;
        private final String type;
        private final int score;
        public Student(String name, String type, int score) {
            this.name = name;
            this.type = type;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public String getType() {
            return type;
        }

    }
    }

