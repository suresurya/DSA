import java.util.*;
public class HASHMAP {

void main(){
    System.out.println("Surya Sure ");
    HashMap<String,Integer> champion=new HashMap<>();
    champion.put("Naruto",100);
    champion.put("Sasuke",120);
    champion.put("Boruto",1000);
    System.out.println("Hashmap DETAILS :"+"\n"+champion);
    champion.remove("Sasuke");
    System.out.println(champion);
    System.out.println(champion.get("Naruto"));
    System.out.println(champion.containsKey("Boruto"));
    IO.println(2%5);
    }
}