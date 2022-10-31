package homework;

import javax.swing.plaf.SliderUI;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Draft {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {-1,-2,-1};//,-3,-4,3,2,1};
        int i = solution.arraySign(ints);
        System.out.println(i);
    }

    static class Solution {
        public int arraySign(int[] nums) {
            int mulValues =0;
            int i =0;
            boolean b = i < nums.length;
            while ( i < nums.length){
                if (nums[i]<0) mulValues = mulValues+1;
                else if (nums[i]==0) return 0;
                i++;
            }
            return (int)Math.pow(-1,mulValues);
        }
    }

}

