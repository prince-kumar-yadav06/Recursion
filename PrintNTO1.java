public class PrintNTO1{

    public static void PrintDes(int n){

        //base case 
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintDes(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        PrintDes(n);
    }
}
