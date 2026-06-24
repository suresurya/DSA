import java.util.*;

public class DSA027_COUNT_FREQUENCY_OF_EACH_ELEMENT_IN_THE_ARRAY {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int [] hashmap=new int[26];
        int n=hashmap.length;

        for(int i =0;i<s.length();i++){
        hashmap[s.charAt(i)-'a']++;

            System.out.println(hashmap[s.charAt(i)-'a']);
        }



                sc.close();
    }
}
