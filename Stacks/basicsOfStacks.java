//package Stacks;
import java.util.*;

public class basicsOfStacks {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Stack <Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        //peek()
        System.out.println(st.peek());
        System.out.println(st);
        //st.pop();
        System.out.println(st);System.out.println("Size :"+st.size());
        while(st.size()>2)
        {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty());
    }
}
