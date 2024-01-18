import java.util.Stack;

public class recursive_reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // System.out.print(removeFrmBottom(st));
        // st.pop();
        System.out.println((st));
        recReverse(st);
        System.out.println((st));
        
    }

    public static Stack<Integer> removeFrmBottom(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 1) {
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size() > 0) {
            st.push(rt.pop());
        }
        return st;
    }

    public static Stack<Integer> removeFromIDX(Stack<Integer> st, int idx) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() > idx + 1) {
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size() > 0) {
            st.push(rt.pop());
        }
        return st;
    }

    public static void recReverse(Stack<Integer> st) {
        // Stack <Integer> rt=new Stack<>();
        if (st.size() == 1)
            return;
        int top = st.pop();
        recReverse(st);
        pushAtBottom(top, st);
    }

    public static void pushAtBottom(int x, Stack<Integer> st) {
        if (st.size() == 0)
        {
            st.push(x);return;
        }
        int top = st.pop();
        pushAtBottom(x, st);
        st.push(top);
    }

}
