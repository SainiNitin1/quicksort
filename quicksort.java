import java.util.Scanner;
public class quicksort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int [] arr,int st,int end){
        //let's select the pivot element
        int cnt=0;


        for(int i=st;i<=end;i++)
        {
            if(arr[st]>arr[i]){
                cnt++;
            }
        }
        swap(arr,st,st+cnt);
        int pi=st+cnt;


        //now let's place the elements greater than pivot element to its right and elements less than pivot element to its left
        int i =st;
        int j=end;



        while(i<pi && j>pi){


            while(arr[i]<arr[pi]){
                i++;
            }
            while(arr[j]>arr[pi]){
                j--;
            }
            if(i<pi&&j>pi){
                swap(arr,i,j);
            }
        }
        return pi;


//        return st+cnt;
    }
    static void quick_sort(int arr[],int st,int end){
        //break statement
        if(st>=end) return;

        //self work
        int pi =partition(arr,st,end);

        //recursive work
        quick_sort(arr,st,pi-1);
        quick_sort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr []={7,13,8,5,10,2,4};
        quick_sort(arr,0,6);

        for(int i =0;i<=6;i++){
            System.out.println(arr[i]);
        }
    }
}
