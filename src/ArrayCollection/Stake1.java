package ArrayCollection;

import java.util.Stack;

public class Stake1 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        System.out.println(s.empty());

        s.push("Jyoti"); // 0
        s.push("Kishor"); // 1
        s.push("Madhura"); //2
        s.push("Rahul"); //3
        s.push("Sameer"); //4
        s.push("Sri vidya"); //5
        s.push("Amol"); //6
        System.out.println(s.empty()); // false
        System.out.println(s);
        System.out.println(s.pop()); // removes and returns the top element
        System.out.println(s);

        System.out.println(s.pop()); //
        System.out.println(s);



    }
}
