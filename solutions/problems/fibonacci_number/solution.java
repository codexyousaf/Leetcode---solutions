class Solution {
    public int fib(int n) {
        if(n==1||n==0)
        {
            return n;
        }
        return fib(n-1)+fib(n-2); 
    }
}
public class Main{
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        System.out.println(sol.fib(4));
    }
}