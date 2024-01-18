import java.util.ArrayList;

public class InsertInHeap {
    //for min heap
    static ArrayList <Integer>arr= new ArrayList<>();
    public static void add(int data)
    {
        //add at last index
        arr.add(data);
        int x=arr.size()-1;//x is child 
        int par=(x-1)/2;//par is parent
        while(arr.get(x)<arr.get(par))//o(log n)
        {
            //swap
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);
        }
    }
    public static void main(String[] args)
    {
        int minheap[]={2,3,4,5,10,1};
        
    }
}
