import java.util.HashSet;
class Solution {
    public static boolean containsDuplicate(int[] num) {
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0 ; i<num.length;i++)
        {
            if(hash.contains(num[i]))
            {
                return true;
            }
            hash.add(num[i]);
        }
        return false;
}
}
public class Main{  
    public static void main(String[] args)
    {
        Solution s =new Solution();
        int arr[]={1,2,3,4,1};
        boolean bool=s.containsDuplicate(arr);
        System.out.println(bool);
    }
}