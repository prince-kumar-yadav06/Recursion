public class Find1stOcuurence{
    
    public static int solution(int []arr,int i,int key){

        //base case
        if(i> arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        //call recursion for next index
       return solution(arr, i+1,key);
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,8,9,0,5};
        // int arr[]={1,2};
        int key=5;

        System.out.println(solution(arr, 0,key));
    }

}
