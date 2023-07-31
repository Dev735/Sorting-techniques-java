public class QuickSort {
    public static void sort(int arr[],int s,int e){
        if(s<e){
        int pi=part(arr,s,e);
        sort(arr,s,pi-1);
        sort(arr,pi+1,e);
    }}

    public static int part(int arr[],int s,int e){
        int pivot=arr[e]; 
        int i=s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
            i++;
            int temp=arr[i];
            arr[i]=arr[e];
            arr[e]=temp;
            return i;
        

    }
    public static void main(String[] args){
        int arr[]={2,3,1,5};
        int n=arr.length;
        sort(arr,0,n-1);
        for(int i =0 ; i<n;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
}
