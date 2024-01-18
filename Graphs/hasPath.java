import java.util.ArrayList;

public class hasPath {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(hasPath(graph, 0, 99, new boolean[v]));
        // int a[]={1,2,3,4};
        // int i=0;
    }
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) {
        if (src == dest)
            return true;
        vis[src] = true; // Mark the current vertex as visited
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);//neighbour =e.destination
            if (!vis[e.dest] && hasPath(graph, e.dest, dest,  vis)) {
                return true;
            }
        }
        return false;
    }
    static class Edge {
        int src; // source
        int dest; // destination
        int wt; // weight

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph

        // 0th vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1st vertexz
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2nd vertex
        graph[2].add(new Edge(2, 4, 2));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 1, 1));

        // 3rd vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4th vertex
        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 6, 1)); // Add edge to vertex 6
    }
}


