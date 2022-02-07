package HandsOnPractice;

//Java program to implement Graph data structure

public class Graph {

    class Edge{
        int source,destination;
    }

    int vertices, edges;

    Edge[] edge;

    Graph(int vertices, int edges){
        this.vertices = vertices;
        this.edges = edges;

        edge = new Edge[edges];
        for (int i=0; i<edges; i++){

            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        int noVertices = 5;
        int noEdges = 8;
        Graph g = new Graph(noVertices, noEdges);

        // create graph
        g.edge[0].source = 1;   // edge 1---2
        g.edge[0].destination = 2;

        g.edge[1].source = 1;   // edge 1---3
        g.edge[1].destination = 3;

        g.edge[2].source = 1;   // edge 1---4
        g.edge[2].destination = 4;

        g.edge[3].source = 2;   // edge 2---4
        g.edge[3].destination = 4;

        g.edge[4].source = 2;   // edge 2---5
        g.edge[4].destination = 5;

        g.edge[5].source = 3;   // edge 3---4
        g.edge[5].destination = 4;

        g.edge[6].source = 3;   // edge 3---5
        g.edge[6].destination = 5;

        g.edge[7].source = 4;   // edge 4---5
        g.edge[7].destination = 5;

        for (int i=0; i<noEdges; i++){
            System.out.println(g.edge[i].source+" - "+g.edge[i].destination);
        }
    }
}
