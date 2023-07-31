public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length ;i++){
           System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
      int arr[]={3,1,5,2};
      for(int i=0;i<arr.length; i++){
        int small=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[small]>arr[j]){
                int temp=arr[small];
                arr[small]=arr[j];
                arr[j]=temp;
            }
        }
      }

      printArray(arr);
    }

}
