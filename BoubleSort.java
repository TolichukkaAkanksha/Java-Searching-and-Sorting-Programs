
    import java.util.*;
public class BoubleSort {
    public static void main(String arg[])
    {
        int[] arr={9,8,7,6,5,4,3};
        int size=arr.length;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    
    }

    
}


