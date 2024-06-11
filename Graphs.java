import java.util.*;

public class Graphs{
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.des=d;
            this.wt=w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i =0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>(); //this creates empty arraylists at that position in the array
        }

        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,2,2));
        graph[1].add(new Edge (1,3,3));
       

    }

    public static void main(String args[]){
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        for(int i=0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.des);
            System.out.print(e.wt);
        }

    }
}