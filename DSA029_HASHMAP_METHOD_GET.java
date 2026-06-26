import java.util.*;

public class DSA029_HASHMAP_METHOD_GET {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
        System.out.println(map.get(1));

        // it is ueed to retrieve(Fetch ) the value associated with a  given key from a hashmap
        //simplyy return the  value associated with the key that's it.................................

        for(int i=1;i<=map.size();i++){
            System.out.println(map.get(i));
        }

        sc.close();
    }
}
