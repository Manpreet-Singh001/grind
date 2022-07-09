public class LC238 {


    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                left = left * nums[i - 1];
            }
            res[i] = left;
        }

        int right = 1;
        for(int i = nums.length - 1; i>= 0; i--){
            if(i != nums.length - 1){
                right = right * nums[i+1];
            }
            res[i] *= right;
        }

        return res;
    }


    public static void main(String[] args) {
        int[] values = {-1,1,0,-3,3};
        int[] solution = productExceptSelf(values);

        for (int i : solution) {
            System.out.print(i + ",");
        }

    }

}
