import java.util.*;
public class BinarySearch {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int size=sc.nextInt();
        System.out.println("enter array elements");
        int[] arr=new int[size];
        for(int c=0;c<size;c++)
        {
            arr[c]=sc.nextInt();
        }
        System.out.println("enter key");
        int key=sc.nextInt();
        int low=0;
        int high=size-1;
        boolean flag=false;
        while(low<=high)
        {   int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                System.out.println("element found at index:"+mid);
                flag=true;
                break;
            }
            if(arr[mid]<key)
            {
                low=mid+1;

            }
            if(arr[mid]>key)
            {
                high=mid-1;
            }
            
        }
        if(flag==false)
        {
            System.out.println("element not found");
        }
    }
    
}
