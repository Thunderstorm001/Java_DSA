package Graph2;
import java.util.*;
public class TopologicalSorting {
      static class Edge { 
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) 
        {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void topSort(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        Stack<Integer> n = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                topSortUtil(graph, i, visited, n);
            }
        }
        while (!n.empty()) {
            System.out.print(n.pop() + " ");
        }
    }   

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean visited[], Stack<Integer>m) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                topSortUtil(graph, e.dest, visited, m);
            }
        }
        m.push(curr);
    }
     public static void createGraph(ArrayList<Edge>[] graph) 
    {
        int v=5;
        //ArrayList<Edge> graph[]=new ArrayList[v];
        //just like int arr[]=new int[v];
        for(int i=0;i<v;i++)
        {
            graph[i]=new ArrayList<>();
        }
        //0 th vertex 
        graph[0].add(new Edge(0,1,5));

        //1 st vertex
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //2 st vertex
        graph[2].add(new Edge(2,4,2));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,1,1));

        //3 st vertex
        graph[3].add(new Edge(3,1,3));        
        graph[3].add(new    Edge(3,2,1));        

        // 4th vertex
        graph[4].add(new Edge(4,2,2));  
    }
    public static void main(String[] args) 
    {
        int v=7;
        ArrayList<Edge> graph[]= new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    } 
}

