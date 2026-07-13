class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        return binarySearch(nums,target,start,end);
         }
    public int binarySearch(int[] nums,int target, int start, int end)
    {
        if(start<=end)
        {
            int mid= start + (end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
           else if(nums[mid]>target)
            {
                end=mid-1;
                return binarySearch(nums,target,start,end);
            }
            else
            {
                start=mid+1;
                return binarySearch(nums,target,start,end);
            }
        }
        return -1;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Solution s= new Solution();
        int[] arr = {-1,0,3,5,9,12};
        int target=9;
         System.out.println(s.search(arr,target));
        

    }
}