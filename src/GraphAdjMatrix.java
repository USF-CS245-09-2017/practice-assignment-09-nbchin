
public class GraphAdjMatrix implements Graph {
	
	int[][] edges;

	public GraphAdjMatrix(int size) {
		// TODO Auto-generated constructor stub
		edges = new int[size][size];
	}

	@Override
	public void addEdge(int v1, int v2) {
		// TODO Auto-generated method stub
		edges[v1][v2] = 1;
		edges[v2][v1] = 1;
	}

	@Override
	public void topologicalSort() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEdge(int v1, int v2, int weight) {
		// TODO Auto-generated method stub
		edges[v1][v2] = weight;
		edges[v2][v1] = weight;
	}

	@Override
	public int getEdge(int v1, int v2) {
		// TODO Auto-generated method stub
		return edges[v1][v2];
	}

	@Override
	public int createSpanningTree() {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
