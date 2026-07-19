class Solution {
    public void rotate(int[] nums, int k) {
          if (nums == null || nums.length <= 1) {
            return;
        }
         k = k % nums.length;
        if (k == 0) return; 
   int[] num = new int[k];
   for(int i=0; i<k; i++)
   {
    num[i] =nums[nums.length-k+i];}
int m=0;
    for(int j=nums.length-1; j>=k; j--)
    { nums[j] = nums[j-k];
    m++;
    }
    for(int n=0; n<num.length; n++)
    {
        nums[n]=num[n];
    }
   }
   
    }
