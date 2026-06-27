import java.util.*;

public class DSA034_COUNT_FREQUENCY_OF_WORDS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words={"java", "is", "fun", "java", "is", "awesome" };
        HashMap<String,Integer> map=new HashMap<>();
        for(int i =0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        System.out.println(map);

        sc.close();
    }
}
