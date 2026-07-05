import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
       for(int i=0; i<nums.length; i++)
            {
              
              int compliment = target-nums[i];
              if(map.containsKey(compliment))
              {
                return new int[]{map.get(compliment),i};
              }
              map.put(nums[i],i);
            }
            return new int[]{-1,-1};
        }
    }
    public class Main{
    public static void main(String[] args)
{
    Solution sol=new Solution();

    int[] num={2,5,7,11};
    int target=9;
    int[] slot=sol.twoSum(num,target);
    System.out.println("[" + slot[0] + "," +slot[1]+"]" );
   
}
    }
