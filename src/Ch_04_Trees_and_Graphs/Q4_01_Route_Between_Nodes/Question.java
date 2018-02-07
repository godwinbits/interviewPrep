package Q4_01_Route_Between_Nodes;
import java.util.*;

public class Question {
	public enum State {
		Unvisited, Visited, Visiting;
	} 

	public static void main(String a[])
	{
		Q4_01_Route_Between_Nodes.Graph g = createNewGraph();
		Node[] n = g.getNodes();
		Node start = n[0];
		Node end = n[4];
		System.out.println(search(g, start, end));
	}
	
	public static Q4_01_Route_Between_Nodes.Graph createNewGraph()
	{
		Q4_01_Route_Between_Nodes.Graph g = new Q4_01_Route_Between_Nodes.Graph();
		Node[] temp = new Node[6];

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
	
	public static void BFS(Graph g,Node source) {
		Queue<Node> visitNodes = new LinkedList<Node>();
		Node[] vertices = g.getNodes();
		for(int i=0; i<vertices.length;i++) {
			vertices[i].state = State.Unvisited;
		}
		source.state = State.Visited;
		visitNodes.offer(source);
		while(!visitNodes.isEmpty()) {
			Node current = visitNodes.poll();
			Node[] neighbours = current.getAdjacent();
			for(int i=0;i<neighbours.length;i++) {
				if(neighbours[i].state == State.Unvisited) {
					neighbours[i].state = State.Visited;
					visitNodes.offer(neighbours[i]);
				}
			}
		}	
	}
	
	public static void DFS(Graph g, Node source) {
		source.state = State.Visited;
		Node[] neighbours = source.getAdjacent();
		for(int i=0;i<neighbours.length;i++) {
			if(neighbours[i].state == State.Unvisited) {
				DFS(g,neighbours[i]);
			}
		}
	}

    public static boolean search(Graph g,Node start,Node end)  {
		//TODO: to be implemented

	BFS(g,start);
    	
	//BFS(g,start);
	if(end.state == State.Visited)
		return true;
	else
		return false;

    }
}