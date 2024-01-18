import java.util.Stack;

public class deleteMid_Stack {
    public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        if(s.isEmpty())return ;
        int k=(sizeOfStack/2)+1;
        vish(s,k);
    } 
    static void vish(Stack<Integer>st,int k){
        if(k==1){
            st.pop();return;
        }
        
        int temp=st.pop();
        vish(st,k-1);
        st.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<5;i++){
            s.push(i);
        }
        deleteMid(s,5);
        for(int i=0;i<4;i++){
            System.out.println(s.pop());
        }
    }
}
