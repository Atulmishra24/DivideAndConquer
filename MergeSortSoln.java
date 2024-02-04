public class MergeSortSoln{

  
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void mergeSortArray(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSortArray(arr, si, mid);
        mergeSortArray(arr, mid + 1, ei);
        mergeArr(arr, si, mid, ei);
    }

    public static void mergeArr(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[] = { 7, 2, 6, 3, 5 };
        int end = arr.length - 1;
        mergeSortArray(arr, 0, end);
        printArray(arr);
    }
}hg