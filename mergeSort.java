import java.util.*;
public class mergeSort{
public static void merge1(int arr[],int s,int mid,int e)
{
    int temp[]=new int[e-s+1];
    int l=s;
    int r=mid+1;
    int idx=0;
    while(l<=mid&&r<=e)
    {
        if(arr[l]<=arr[r])
        {
            temp[idx]=arr[l];
            l++;
            idx++;
        }
        else{
            temp[idx]=arr[r];
            r++;
            idx++;
        }
    }
    while(l<=mid)
    {
        temp[idx]=arr[l];
        idx++;
        l++;
    }
    while(r<=e)
    {
        temp[idx]=arr[r];
        idx++;
        r++;
    }
    for(int i=s;i<=e;i++)
    {
        int count=0;
        arr[i]=temp[count];
        count++;
    }
}


    public static void merge(int arr[],int s,int e)
    {
        if(s==e)return;
        int mid=s+(e-s)/2;
        merge(arr,s,mid);//left array
        merge(arr,mid+1,e);//right array
        merge1(arr,s,mid,e);
        
        }
    public static void main(String[]args)
    {
        int arr[]={23,12,44,54,66};
        int s=0;
        int e=arr.length-1;
        merge(arr,s,e);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}