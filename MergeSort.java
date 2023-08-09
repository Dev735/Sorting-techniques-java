public class MergeSort {
    public static void Divide(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        Divide(arr, s, mid);
        Divide(arr, mid + 1, e);
        Merge(arr, s, mid, e);
    }

    public static void Merge(int arr[], int s, int l, int e) {
        int merged[] = new int[e - s + 1];
        int idx1 = s;
        int idx2 = l + 1;
        int x = 0;
        while (idx1 <= l && idx2 <= e) {
            if (arr[idx2] > arr[idx1]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= l) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= e) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = s; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        Divide(arr, 0, arr.length - 1);
        
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
