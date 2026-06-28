import java.util.*;

public class DSA038_FREQUENCY_COUNT_BUT_DIFFENT_OUTPUTFORMAT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        String ans = map.toString()
                .replace("{", "{'")
                .replace(",", "',").replace("=", ":")
                .replace(":", "':");
        System.out.println(ans);

        sc.close();
    }
}