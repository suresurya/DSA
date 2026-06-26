import java.util.*;

public class DSA031_HASHMAP_METHOD_GETORDEFAULT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Surya");
        map.put(2,"Sure");
        map.put(3,"Rama");
        System.out.println(map.getOrDefault(1,"not Found any Value Fuck !!"));

        // git returns the value  associated wiht the key  if the key doesn't exist , it retusn a  default value  tha we provide
        //

        sc.close();
    }
}
