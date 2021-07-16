package leetCode;

/**
 * 冒泡排序
 */
public class SortBubble {

    public static void main(String[] args) {
        int[] nums = {5,3,2,3,1};
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums.length - i -1; j++) {
                if (nums[j+1] < nums[j]) {
                     int value = nums[j+1];
                     nums[j+1] = nums[j];
                     nums[j] = value;
                }
            }
            //没有数据交换，退出冒泡循环
            if (flag) break;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        return;
    }
    
}
