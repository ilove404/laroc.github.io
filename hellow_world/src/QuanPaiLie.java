import java.util.ArrayList;
import java.util.List;

public class QuanPaiLie {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> strings1 = new ArrayList<>();
        strings1.add("phone");
        strings1.add("blue");
        strings1.add("pixel");
        List<String> strings2 = new ArrayList<>();
        strings2.add("computer");
        strings2.add("silver");
        strings2.add("lenovo");
        List<String> strings3 = new ArrayList<>();
        strings3.add("phone");
        strings3.add("gold");
        strings3.add("iphone");
        List<List<String>> strings = new ArrayList<>();
        strings.add(strings1);
        strings.add(strings2);
        strings.add(strings3);
        int i = solution.countMatches(strings, "color", "silver");
        System.out.println(i);
    }

/*    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {

            return null;
        }
    }*/
    static class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int count=0;
            if (ruleKey.equals("type")) {
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(0).equals(ruleValue))++count;
                }
            } else if (ruleKey.equals("color")) {
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(1).equals(ruleValue))++count;
                }
            }else if (ruleKey.equals("name")){
                for (int i = 0; i < items.size(); i++) {
                    if (items.get(i).get(2).equals(ruleValue))++count;
                }
            }
            return count;
        }
    }
}
