import java.util.*;
public class LINEAR_PROBING {
    void insert(){

    }
    static void main(){
        Scanner sc=new Scanner(System.in);
        IO.print("Enter the size of the HASH : ");
        int size= sc.nextInt();
        int[] lp =new int[size];
        Arrays.fill(lp,-1);

        int o=-1;
        while(o!=5){
            IO.println("MENU :-----------");
            IO.println("1. INSERT ");
            IO.println("2. Remove");
            IO.println("3. Search ");
            IO.println("4. Display ");
            IO.println("5. Exit>>>>");
            IO.print("Enter Your Option : ");
            o=sc.nextInt();
            switch(o){
                case 1:
                    IO.print("Enter the Value : ");
                    int n=sc.nextInt();
                    lp.add(n);
                    break;
                case 2:
                    IO.print("Enter the value to Remove : ");
                    n=sc.nextInt();
                    lp.remove(n);
                    break;
                case 3:
                    IO.print("Enter the Elelment to Search : ");
                    n =sc.nextInt();
                    IO.print((lp.contains(n))?"Value Is present in Lenear Probing ":"Not Present in the Linear Probing...........");
                    break;
                case 4:
                    IO.print("Display : ");
                    for(int )
            }
        }
    }
}
