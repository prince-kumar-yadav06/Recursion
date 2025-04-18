public class PrintFactorial{

    public static int Factorial(int n){

        //base case 
        if(n==0){
            return 1;
        }
       int fact=n* Factorial(n-1);
       return fact;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(Factorial(n));
    }
}
