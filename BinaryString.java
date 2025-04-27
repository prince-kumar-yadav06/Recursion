public class BinaryString {
    public static void printBnryStr(int n,int lastplace,String str){

        //base case
        if(n==0){
            System.out.println(str);
            
            return;
        }

        printBnryStr(n-1,0, str+"0");
        if(lastplace==0){
            printBnryStr(n-1, 1, str+"1");
        }
    }

    public static void main(String args[]){

        int n=3;
        printBnryStr(n, 0,"");
    }
}
