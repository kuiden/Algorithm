package leetCode;

/**
 * 插入排序
 */
public class SortInsertion {

    public static void main(String[] args) {
        int[] nums = {5,3,2,3,1};
        for (int i = 1; i < nums.length; i++) {
            int m = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums[j] > m) {
                    nums[j+1] = nums[j];
                }else {
                    break;
                }
            }
            nums[j+1] = m;
        }
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }

}
