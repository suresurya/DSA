import java.util.*;

public class DSA030_HASHMAP_METHOD_CONTAINS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
        System.out.println(map.containsKey(1));

        // it returns only the  true or false that's it if
        // if the key exists it returns the  true
        // or else it returns the  false as the output that's it


        sc.close();
    }
}
