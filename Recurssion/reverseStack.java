import java.util.Stack;

public class reverseStack {
    static void reverse(Stack<Integer> st)
    {
        if(st.size()==1)return ;
        int temp=st.pop();
        reverse(st);
        insertlast(temp,st);
    }
    
    static void insertlast(int temp,Stack<Integer> st){
        if(st.isEmpty()){
            st.add(temp);return;
        }
        int vish=st.pop();
        insertlast(temp,st);
        st.add(vish);
    }
}
