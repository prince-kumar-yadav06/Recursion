public class FindLastOcuurence {
    
    public static int solution(int []arr,int i,int key){

        //base case
        if(i <0){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        //call recursion for next index
       return FindLastOcuurence(arr, i-1,key);
    }

    public static void main(String[] args) {
        int arr[]={1,5,4,5,7,8,9,0};
        // int arr[]={1,5,2,3};
        int key=5;

        System.out.println(FindLastOcuurence(arr, arr.length-1,key));
    }

}
