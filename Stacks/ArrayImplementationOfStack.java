public class ArrayImplementationOfStack {
    public static class Stack {
        private int arr[] = new int[5];
        private int idx = 0;

        void push(int x) {
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("error!!!as Szie is 0");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        boolean isFull() {
            if (idx == arr.length) {

            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println();
        System.out.print(st.size());
        System.out.println();
        st.pop();
        System.out.println(st.size());
        System.out.println();
        st.display();
        System.out.println(st.isEmpty());
        ;

    }
}
