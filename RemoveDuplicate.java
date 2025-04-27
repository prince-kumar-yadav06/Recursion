public class RemoveDuplicate {
    
    public static void Sol(String str,int i, StringBuilder ans){

        //base case
        if(str.length() < 1 || i > str.length()-1){
            return ;
        }

        if(str.charAt(i-1) != str.charAt(i)){
            char ch=str.charAt(i-1);
            ans=ans.append(ch);
        }

        Sol(str, i+1, ans);
    }

    public static void main(String args[]){

        String str="appnnacollege";

        StringBuilder ans=new StringBuilder();
        
        Sol(str,1,ans);
        System.out.println(ans);
    }
}
