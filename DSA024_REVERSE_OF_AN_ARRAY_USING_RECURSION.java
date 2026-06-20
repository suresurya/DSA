import java.util.*;
class solution24{
    void printreverse(int n, int[] a){
        if(n==-1) return ;
        System.out.print(a[n]+" ");
        n-=1;
        printreverse(n,a);
    }
}

public class DSA024_REVERSE_OF_AN_ARRAY_USING_RECURSION {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        solution24 sol=new solution24();
        int []a={1,2,3,4,56,7,8,9,7,8,9};


        sc.close();
    }
}
