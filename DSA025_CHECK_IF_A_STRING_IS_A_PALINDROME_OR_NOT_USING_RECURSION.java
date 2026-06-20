import java.util.*;

class solution25{
    boolean checkpalindrome(int i,int n , String s){
        if(i>n-1-i) return true;
        if(s.charAt(i)==s.charAt(n-1-i)){
            i+=1;
            return checkpalindrome(i,n,s);
        }else{
            return false;
        }
    }
}
public class DSA025_CHECK_IF_A_STRING_IS_A_PALINDROME_OR_NOT_USING_RECURSION {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        solution25 sol= new solution25();
        System.out.println((sol.checkpalindrome(0,s.length(),s))?"Palindrome ": " Not  a palindrome ");
        sc.close();
    }
}
