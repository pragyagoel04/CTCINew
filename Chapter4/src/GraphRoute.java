import java.util.*;

public class GraphRoute {
	public enum State {
		visited, visiting, unvisited;
	}

	public static void main(String args[]) {
		Graph g = newGraph();
		Node n[] = g.getNodes();
		Node start = n[0];
		Node end = n[5];
		System.out.println(RouteCheck(g,start,end));
	}

	public static Graph newGraph() {
		Graph g = new Graph();
		Node temp[] = new Node[6];
		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 1);
		temp[5] = new Node("f", 0);
		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		for (int i = 0; i < 6; i++) {
			g.addNode(temp[i]);
		}

		return g;

	}
	
	public static boolean RouteCheck(Graph g, Node start, Node end){
		for(Node u: g.getNodes()){
			u.state=State.unvisited;
		}
		start.state=State.visiting;
		LinkedList<Node> q=new LinkedList<Node>();
		q.add(start);
		Node n;
		while(!q.isEmpty()){
			n=q.removeFirst();
			if(n!=null){
				for(Node v: n.getAdjacent()){
					if(v.state==State.unvisited){
						if(v==end){
							return true;
						}else{
							v.state=State.visiting;
							q.add(v);
						}
					}
				}
				n.state=State.visited;
			}
		}
		return false;
	}

	public static class Graph {
		public Node vertices[];
		public int count;

		public Graph() {
			vertices = new Node[6];
			count = 0;
		}

		public void addNode(Node a) {
			vertices[count] = a;
			count++;
		}

		public Node[] getNodes() {
			return vertices;
		}
	}

	public static class Node {
		public GraphRoute.State state;
		public Node adjacent[];
		public int adjCount;
		public String vertex;

		public Node(String vertex, int adjLen) {
			this.vertex = vertex;
			adjCount = 0;
			adjacent = new Node[adjLen];
		}

		public void addAdjacent(Node a) {
			this.adjacent[adjCount] = a;
			adjCount++;
		}

		public Node[] getAdjacent() {
			return adjacent;

		}

		public String getVertex() {
			return vertex;
		}

	}

}
