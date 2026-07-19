class Solution {
    public int removeDuplicates(int[] nums) {
        int n=0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[n]!=nums[i])
            {
                n++;
                nums[n]=nums[i];
                
            }
        }
        return n+1;
}
}
public class Main{
public static void main(String[] args)
{
Solution s= new Solution();
int[] num= {1,1,2,2,3,3,4,4};
System.out.println(s.removeDuplicates(num));

}
}