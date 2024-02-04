public class QuickSort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void QuickSortMethod(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr,si,ei);
        QuickSortMethod(arr,si,pIdx-1);
        QuickSortMethod(arr,pIdx+1,ei);
    }

    public static int partition(int arr[], int si,int ei){
        int i = si-1;
        int pivot = arr[ei];
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[]args){
        int arr[] = { 6,3,9,8,2,5};
        int n = arr.length-1;
        QuickSortMethod(arr,0,n);
        printArray(arr);
    }
}