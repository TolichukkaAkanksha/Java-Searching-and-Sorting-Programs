import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("input array size");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("input array elements:");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("input your key:");
        int key=sc.nextInt();
        LinearSearch obj=new LinearSearch();
        int result=obj.search(a,key);
        if(result!=-1)
        {
            System.out.println("Element found at index:"+result);
        }
        else{
            System.out.println("Element not found!");
        }
        
        
        
	
		
	}
}
class LinearSearch{
    public int search(int[] arr,int key){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
