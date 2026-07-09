import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int num=0;
        for(int i=1; i<prices.length; i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            num= prices[i]-min;
            if(num>profit)
            {
                profit=num;
            }
        }
        return profit;
    }
}
public class Main{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int[] prices={7,1,5,3,6,4};
        int maxP=s.maxProfit(prices);
        System.out.println(maxP);

    }
}