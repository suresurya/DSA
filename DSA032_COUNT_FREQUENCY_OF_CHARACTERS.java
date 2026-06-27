import java.util.*;

public class DSA032_COUNT_FREQUENCY_OF_CHARACTERS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }






        sc.close();
    }
}
