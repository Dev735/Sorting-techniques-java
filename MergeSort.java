import java.util.Scanner;

public class MergeSort {
    
    public static void main(String[] args){
        int arr[]={6,3,2,1,7,8};
        int n=arr.length;
        Divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
 System.out.println();
    }
    public static void Divide(int arr[], int s,int e){
        if(s>=e){
            return;
        }       
        int  mid=s=(e-s)/2;
        Divide(arr,s,mid);
        Divide(arr,mid+1,e);
        Conquer(arr,s,mid,e);
    }
    public static void Conquer(int arr[],int s,int mid,int e){
        int merged[] = new int[e-s+1];
        int i1=s;
        int i2=mid+1;
        int x=0;
        while(i1<=mid&&i2<=e){
            if(arr[i1]<=arr[i2]){
                merged[x++]=arr[i1++];

            }
            else{
                merged[x++]=arr[i2++];

            }
        }
        while(i1<=mid){
            merged[x++]=arr[i1++];
        }
        while(i2<=e){
            merged[x++]=arr[i2++];
        }
      for(int i=0 , j=s;i<merged.length;i++,j++){
                  arr[j]=merged[i];
      }



    }
}
