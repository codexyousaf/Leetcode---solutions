class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        k = k % nums.length;
        if (k == 0)
            return;
        int a=0;
        int n=nums.length;
        reverse(nums,a,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
    public void reverse(int[] num, int start, int end)
    {
        while(start<end)
        {
            int number=num[start];
            num[start]=num[end];
            num[end]=number;
            start++;end--;
        }
    }
}