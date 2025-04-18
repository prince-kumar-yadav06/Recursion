public class  PrintFibonacci{

    public static int Fibonacci(int n){

        //base case 
        if(n==0){
            return 1;
        }
       int sum=n* Fibonacci(n-1);
       return sum;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(Fibonacci(n));
    }
}
