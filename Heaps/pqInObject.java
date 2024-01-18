
import java.util.*;
public class pqInObject 
{
    
    public static  void main(String[] args)
    {
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        pq.add(new Student ("a", 2));
         pq.add(new Student ("b", 7));
          pq.add(new Student ("c", 12));
        pq.add(new Student ("V", 1));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name + "->"+pq.peek().rank);
            pq.remove();
        }
    }


    public static class Student implements Comparable<Student>
    {
        String name;
        int rank;
        public Student(String name, int rank)
        {
            this.name = name;
            this.rank = rank;
        } 

        @Override
        public int  compareTo(Student s2)
        {
            return this.rank-s2.rank;
        }
    }
}
