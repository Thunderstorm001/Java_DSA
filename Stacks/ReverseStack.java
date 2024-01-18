import java.util.Stack;

public class ReverseStack {
     public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println(reverseStack(st));
    }
    public static  Stack reverseStack(Stack <Integer> st)
    {
        Stack <Integer>temp =new Stack<>();
        Stack <Integer>result =new Stack<>();
        while(st.size()>0)
        {
            temp.push(st.pop());
        }
        // while(temp.size()>0)
        // {
        //     result.push(temp.pop());
        // }
        return temp;
    }
}
