import java.util.*;

public class DSA009_STACK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        Stack<String> stack=new Stack<>();
        stack.push("Hello ");
        stack.push("hello surya ");
        stack.push("Hello surya how do you do ");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        sc.close();
    }
}
