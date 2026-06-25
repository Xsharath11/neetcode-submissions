class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);

        for (int i = 0; i<nums.length; i++) {
            res[i] = prod;
            prod *= nums[i];
        }
        
        int postfix = 1;
        for (int i=nums.length-1; i > -1; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
        
    }
}  
