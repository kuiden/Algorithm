package leetCode.change;

/**
 * @author kudeng
 * @version 2021/7/15 15:44
 * @description
 */
public class OddEvenExchange {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int head = 0;
        int tail = nums.length - 1;
        while (head < tail) {
            if ((nums[head] & 1) == 1) {
                head++;
                continue;
            }
            if ((nums[tail] & 1) == 0) {
                tail--;
                continue;
            }
            int value = nums[head];
            nums[head] = nums[tail];
            nums[tail] = value;
            head = head + 1;
            tail = tail - 1;
        }
        return;
    }

}
