import java.util.*;

public class ArrayList_Methods{
 static void main(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<String> cars=new ArrayList<>();
    for(int i=0;i<n;i++){
        cars.add(sc.next());
    }
    System.out.println(cars);
    //add at a specific index
     cars.add(0,"Surya");
     System.out.println("After insert at the specific index: "+cars);
     ArrayList<Integer> rate=new ArrayList<>();
     rate.add(12);
     rate.add(13);
     rate.add(14);
     System.out.println("Secound list "+ rate);
     //cars.addAll(Arrays.toString(rate));
    System.out.println("Both lists Combined : "+ cars);
}
}
