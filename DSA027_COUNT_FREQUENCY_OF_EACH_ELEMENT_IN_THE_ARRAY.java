import java.util.*;
import java.util.stream.*;

public class DSA027_COUNT_FREQUENCY_OF_EACH_ELEMENT_IN_THE_ARRAY {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] map=new int[26];
        for(int i =0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        System.out.println("Letter          Count ");
        IntStream.range(0,26).filter(i-> map[i]>0).forEach(i-> System.out.println((char)(i+'a')+"     ->     "+map[i]+" "));
        sc.close();
    }
}
