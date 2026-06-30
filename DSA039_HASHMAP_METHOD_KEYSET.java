import java.util.*;

public class DSA039_HASHMAP_METHOD_KEYSET {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map=new HashMap<>();
        map.put(2,"suriya ");
        map.put(1,"Rama Surya");
        map.put(3,"Sure Surya sri venkart rama surya");
        for(int i:map.keySet()){
            System.out.println(i+"\t"+map.get(i));
        }



        sc.close();
    }
}
