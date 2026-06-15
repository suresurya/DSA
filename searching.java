import java.util.*;

import java.util.stream.IntStream;

public class searching {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] a= {1,52,81,1,8,1,2,5,8,82,85,18,585,8,596,84,185,96,96,8,7,8,9,4522,42,1,445};
        System.out.print("Enter the Number:  ");
        int n =sc.nextInt()
;
        int index= IntStream.range(0,a.length).filter(x-> a[x]==n).findFirst().orElse(-1);
        System.out.println("Index:  "+ index);
    }
}
