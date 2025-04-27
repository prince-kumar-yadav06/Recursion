public class PairFriends {
    
    public static int FindPair(int n){

        if( n == 1 || n==2){
            return n;
        }

        //  for single 
        int fn1=FindPair(n-1);

        // for double 
        int fn2=FindPair(n-2);

        return fn1+ fn1*fn2;
    }

    public static void main(String args[]){
        int n=2;

        System.out.println(FindPair(n));
    }
}
