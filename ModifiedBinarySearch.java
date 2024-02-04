public class ModifiedBinarySearch{


    public static int search(int arr[] ,int si,int ei, int target){

        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;

        //Base Case 
        if(arr[mid]== target)
        {
            return mid;
        }


        //Line L1
        if(arr[si]<=arr[mid]){

            //case a: left
            if(arr[si]<= target && target<=arr[mid]){
                 return search(arr,si,mid-1,target);
            }
            //case b : right
            else{
              return  search(arr,mid+1,ei,target);
            }

        }

        //Line L2
        else{
            // case c: right
            if(arr[mid]<=target && target<=arr[ei]){
               return search(arr,mid+1,ei,target);

            }
            
            // case d:left
            else{
              return  search(arr,si,mid-1,target);
            }
        }

    }

    public static void main(String[] args){

        int arr [] = {4,5,6,7,0,1,2,3};
        int target = 0;
        int targetIdx = search(arr,0,arr.length-1,target);
        System.out.println(targetIdx);
    }
}