// //quicksort(int [] arr, s,e)
// {
//     if(s>0)
//     return
//     int pivot=partition(arr,s,e);
//     //left array: quicksort(arr,s,pivot-1)
//     //right array: quicksort(arr,pivot+1,e);

// }

// partition(int arr[],s,e)
// {
//     int pos =s;
//     for(int i=s;i<=e;i++)
//     {
//         if(arr[i]<=arr[e])
//         {
//             swap(arr[pos],arr[i]);
//             pos++;
//         }
//     }
//     return pos;
// }


import java.util.*;
public class quicksort
{
    public static int partition(int []arr,int s,int e)
    {
        int pos=s;
        for(int i=s;i<=e;i++)
        {
            if(arr[i]<=arr[e])
            {
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                pos++;
            
            }
        }
        return pos-1;
    }

    public static void quicksort(int[] arr,int s,int e)
    {
        if(s>=e)return;
        int pivot= partition(arr,s,e);
        quicksort(arr,s,pivot-1);
        quicksort(arr,pivot+1,e);
    }
    public static void main(String [] args)
    {
        int arr[]={2,4,3,6,5,1};
        quicksort(arr,0,5);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }

        System.out.println();
    }
}