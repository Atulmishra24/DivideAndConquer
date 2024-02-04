public class MajorityOccurAssignment{

    
    //BruteForce 
    public static int bruteForceMajority(int arr[]){
        int majorityValue = arr.length/2;
        
        for(int i =0;i<arr.length;i++){
            int count = 0;
            for(int j = 0 ; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > majorityValue){
               
                return arr[i];
            }
        }
        return -1;

    }


    //Optimized Array
    public static int majorityOptimized(int [] arr, int lo,int hi)
{

    //Base Case 
    if(lo==hi){
        return arr[lo];
    }

    int mid = lo+(hi-lo)/2;
    int left = majorityOptimized(arr,lo,mid);
    int right = majorityOptimized(arr,mid+1,hi);

    if(left==right){
        return left;
    }

    int leftCount = countInRange(arr,left,lo,hi);
    int rightCount = countInRange(arr,right,lo,hi);


    return leftCount>rightCount?left:right;
    
}
    
public static int countInRange(int [] arr , int num , int lo,int hi){
    int count =0;
    for(int i =lo ; i<=jkhi ; i++){
        if(arr[i]==num){
            count++;
        }
    }
    return count;

}
    public static void main(String[] args){
        int arr[] = {2,2,1,1,1,2,2};
    
        //BruteForce 
        int idx = bruteForceMajority(arr);
        System.out.println(idx);

        //Optimized Approach

        System.out.println(majorityOptimized(arr,0,arr.length-1));


    }
}