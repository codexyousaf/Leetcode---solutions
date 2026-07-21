import java.util.ArrayList;
public class Union{
    public int[] findUnion(int[] arr1 , int[] arr2)
    {
      int n=arr1.length;
      int m= arr2.length;
      int i=0, j=0;
      ArrayList<Integer> list= new ArrayList<>();
      while(i<n&& j<m)
      {
        if(arr1[i]<arr2[j])
        {
            addIfNotDuplicate(list,arr1[i]);
            i++;
        }
        else if(arr1[i]>arr2[j])
        {
            addIfNotDuplicate(list,arr2[j]);
            j++;
        }
        else{
            addIfNotDuplicate(list,arr1[i]);
            i++;j++;
        }
      }
      while(i<n)
      {
        addIfNotDuplicate(list,arr1[i]);
        i++;
      }
      while (j<m)
      {
        addIfNotDuplicate(list,arr2[j]);
        j++;
      }
      int[] finalArray= new int[list.size()];
      for(int k=0; k<list.size(); k++)
      {
        finalArray[k]=list.get(k)  ;  }
        return finalArray;

    }
    public void addIfNotDuplicate(ArrayList<Integer> list, int value)
    {
        if(list.isEmpty()||list.get(list.size()-1)!=value)
        {
         list.add(value);
        }
    }
    public static void main(String[] args)
    {
        int[] arr1= {1,2,2,3,3,4};
        int[] arr2={2,3,4,5,5,6,6};
        Union union= new Union();
        int[] result=union.findUnion(arr1,arr2);
        for(int j=0; j<result.length; j++){
        System.out.print(result[j]+ " ");
        }
    }

}
