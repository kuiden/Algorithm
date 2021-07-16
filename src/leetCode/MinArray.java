package leetCode;

public class MinArray {

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2,2};
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] > nums[right]) {
                left = middle + 1;
            }else if (nums[middle] < nums[right]) {
                right = middle;
            }else {
                //应对midele和right相等的情况，也得移动游标，否则进入死循环
                right--;
            }
        }
        System.out.println(left);
        return;
    }

}
