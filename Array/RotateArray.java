package Array;

public class RotateArray {

    public static void reverse(int[]nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    // RotateRightDirection
    public static int[] rotateRightArray(int[]A, int rotate){
        int len = A.length;
        int B[] = new int[len];
        for(int i = 0; i < len; i++){
            B[(i + rotate) % len] = A[i];
        }
        return B;
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len; // handle k > len
        int left = 0;
        int right = len -1;
        reverse(nums, left, right);
        reverse(nums, left, k-1);
        reverse(nums, k, right);
    }

    // RotateLeftDirection
    public static int[] rotateLeftArray(int[]A, int rotate){
        int len = A.length;
        int B[] = new int[len];
        for(int i = 0; i < len; i++){
            B[(i - rotate + len) % len] = A[i];
        }
        return B;
    }


    public static void main(String[] args) {
        int A[] = {6, 2, 4, 8, 9, 1};
        int[] B = rotateRightArray(A, 2);
        for(int i : B){
            System.out.print(i + " ");
        }
    }
}
