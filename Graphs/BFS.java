import java.util.*;
public class BFS {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean vist[] = new boolean[graph.length];
        q.add(0);// source =0

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vist[curr])// curr not visisted
            {
                // 1.print
                System.out.println(curr + " ");
                // 2.visit mark
                vist[curr] = true;
                // 3.add neighbours to queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        } 
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        bfs(graph);
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        int v = 5;
        // ArrayList<Edge> graph[]=new ArrayList[v];
        // just like int arr[]=new int[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 th vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 st vertex
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 st vertex
        graph[2].add(new Edge(2, 4, 2));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 1, 1));

        // 3 st vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4th vertex
        graph[4].add(new Edge(4, 2, 2));
    }
}
