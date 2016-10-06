package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private int v;
	private LinkedList<Integer> adj[];
	
	Graph(int v) {
		this.v = v;
		this.adj = new LinkedList[v];
		
		for(int i = 0; i < v; i++) {
			this.adj[i] = new LinkedList<Integer>();
 		}
	}
	
	void addEdge(int v, int w) {
		this.adj[v].add(w);
	}
	
	void DFS(int node) {
		boolean[] visited = new boolean[this.v];
		
		DFSUtil(node, visited);
	}
	
	void DFSUtil(int node, boolean visited[]) {
		
		visited[node] = true;
		
		 System.out.print(node+" ");
		 
		Iterator<Integer> iter = this.adj[node].listIterator();
		
		while(iter.hasNext()) {
			int n = iter.next();
			if (!visited[n]) {
				DFSUtil(n, visited);
			}
		}
	}
	
	 public static void main(String args[])
	    {
	        Graph g = new Graph(4);
	 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("Following is Depth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.DFS(2);
	    }
}
