import java.util.ArrayList;
public class Intersection{
    public static int[] findIntersection(int[] arr1, int arr2[])
    {
        int i=0,j=0;
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> list= new ArrayList<>();
        int size;
        while(i<n&& j<m)
        {
            if(arr1[i]==arr2[j])
            {
                list.add(arr1[i]);
                i++; j++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                j++;
           
            }
        }
       int[] finalArray=new int[list.size()];
       for(int l=0; l<finalArray.length;l++)
       {
        finalArray[l]=list.get(l);
       }
       return finalArray;
    }
    public static void main(String[] args)
    {
        int[] arr1= {1,2,3,4,5};
        int[] arr2={3,4,5,6,7};
        int[] result=Intersection.findIntersection(arr1,arr2);
        for(int i=0;i<result.length; i++)
        {
            System.out.println(result[i] + " ");
        }

    }
}
