public class TILINGProblem {
    
    public static int Findway(int n){

        //base case
        if(n == 0 || n==1){
            return 1;
        }

        // for vertical
        int ans1=Findway(n-1);

        // for horizontal
        int ans2=Findway(n-2);

        int totalway=ans1+ans2;

       return totalway;
    }

    public static void main(String[] args) {
        
        // int n=4;
        int n=3;
        System.out.println(Findway(n));
    }

}
