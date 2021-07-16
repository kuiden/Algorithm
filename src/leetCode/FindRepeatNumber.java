package leetCode;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatNumber {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            }else {
                System.out.println(num);
                break;
            }
        }

        int[] nums1 = {2,2,2,0,1};
        for (int i = 0; i < nums1.length; i++) {
            if (i == 0) continue;
            int before = nums1[i-1];
            int curr = nums1[i];
            if (curr < before) System.out.println(curr);
        }
    }

}
