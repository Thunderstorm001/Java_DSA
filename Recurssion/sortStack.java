import java.util.* ;
import java.io.*; 
public class sortStack {
	public static void sortStack(Stack<Integer> st) {
		if(st.size()==1)return ;
		int temp=st.pop();
		sortStack(st);
		insert(st,temp);
	}
	static void insert(Stack<Integer> st,int temp){
		if(st.isEmpty()){
			st.push(temp);return;
		}
		if(st.peek()<=temp){
			st.push(temp);return ;
		}
	
		int vish=st.pop();
		insert(st,temp);
		st.push(vish);
	}
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(5);
        st.push(7);
        st.push(1);
        st.push(9);
        st.push(0);
        sortStack(st);
        for(int i=0; i<5; i++){
            System.out.println(st.pop());
        }
    }
}
