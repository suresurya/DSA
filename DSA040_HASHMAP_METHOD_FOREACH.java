import java.util.*;
public class DSA040_HASHMAP_METHOD_FOREACH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next().toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.print("{");
        int[] count={map.size()};
        map.forEach((key,value)-> {
            count[0]--;
            String comma=(count[0]!=0)?",":"";
            System.out.print("'"+ key+ ":"+value+comma);
        });
        System.out.print("}");
        sc.close();
    }
}
