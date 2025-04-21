public class CheckGivenArrIsSorted {
    
    public static boolean CheckSortedArr(int []arr,int i){

        //base case
        if(i== arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        //call recursion for next index
         return CheckSortedArr(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,8,4};

        System.out.println(CheckSortedArr(arr, 0));
    }
}
