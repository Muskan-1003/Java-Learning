import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Edge>[] adjacencyList;

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination, int weight) {
        adjacencyList[source].add(new Edge(destination, weight));
    }

    // Dijkstra's algorithm to find the shortest path from a source vertex
    public void dijkstra(int source) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(vertices, new Node());
        int[] distances = new int[vertices];
        boolean[] visited = new boolean[vertices];

        // Initialize distances to infinity and visited array to false
        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(visited, false);

        // Distance to the source is 0
        distances[source] = 0;
        priorityQueue.add(new Node(source, 0));

        while (!priorityQueue.isEmpty()) {
            int u = priorityQueue.poll().node;

            // Skip if this node has already been visited
            if (visited[u]) continue;

            // Mark this node as visited
            visited[u] = true;

            // Explore neighbors
            for (Edge edge : adjacencyList[u]) {
                int v = edge.destination;
                int weight = edge.weight;

                // Relaxation step
                if (!visited[v] && distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                    priorityQueue.add(new Node(v, distances[v]));
                }
            }
        }

        // Print shortest path from source to all vertices
        printShortestPaths(source, distances);
    }

    private void printShortestPaths(int source, int[] distances) {
        System.out.println("Shortest paths from vertex " + source + ":");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("To vertex " + i + " is " + distances[i]);
        }
    }

    // Node class to represent a vertex and its distance from the source
    static class Node implements Comparator<Node> {
        public int node;
        public int cost;

        public Node() {
        }

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compare(Node node1, Node node2) {
            return Integer.compare(node1.cost, node2.cost);
        }
    }

    // Edge class to represent an edge in the graph
    static class Edge {
        public int destination;
        public int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1, 9);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(0, 4, 3);
        graph.addEdge(2, 1, 2);
        graph.addEdge(2, 3, 4);

        graph.dijkstra(0);
    }
}
