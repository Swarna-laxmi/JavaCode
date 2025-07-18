package com.sb;

public class QuickSortPractice1
{
    public static void main(String[] args)
    {
        int[] arr={56,23,43,21};
        int low=0;
        int high=arr.length-1;
        quicksort(arr,low,high);
        System.out.println("After sorting");
        for(int n:arr)
            System.out.print(n+" ");

    }

    private static void quicksort(int[] arr, int low, int high) {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

}
