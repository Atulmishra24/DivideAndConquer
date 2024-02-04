public class InversionCount{
    //Brute Force
    
    public static int inversionCountBruteForce(int [] arr){
        int inversionCount =0;
        for(int i =0; i< arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }


    //Optimized Approach

    public static int merge(int [] arr, int left ,int mid,int right){
        
        int i = left , j=mid+1,k=0;
        int [] temp = new int[right-left+1];

        while(i<=mid && j <=right ){

            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                invCount = invCount+(mid-i);
                j++;
                k++;
            }

        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=mid){
            temp[k++] = arr[j++];
        }


        for(i =left, k= 0 ;  k <temp.length ; k++ , i++){
            arr[i] =temp[k]; 
        }


    }
    public static int mergeSort(int arr[], int left, int right){
        int invCount =0;

        if(right>4
        left){
            int mid = (right+left)/2;
            invCount = mergeSort(arr,left,mid);
            invCount+=mergeSort(arr,mid+1,right);
            invCount += merge(arr,left,mid,right);
        }

        return invCount;
    }







    public static void main(String[a] args){
        int arr[] = {2,4,1,3,5};
        //BruteForce Approach
        System.out.println(inversionCountBruteForce(arr,0,arr.length-1));
    }
}