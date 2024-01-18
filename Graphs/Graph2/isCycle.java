// package Graph2;

import java.util.ArrayList;

public class isCycle {
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
    public static boolean isCycle(ArrayList<Edge>graph[]){
         boolean vis[]=new boolean[graph.length];
         boolean stack[]=new boolean[graph.length];

         for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                iscyclicUtil(graph,i,vis,stack){
                    return true;
                }
            }
         }
         return false;
    }

    public static boolean iscyclicUtil(ArrayList<Edge>graph[],int curr, boolean []vis,boolean stack[]){
        vis[curr] = true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(stack[e.dest]==true){
                return true;
            }
            else if(!vis[e.dest] && iscyclicUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }
}
