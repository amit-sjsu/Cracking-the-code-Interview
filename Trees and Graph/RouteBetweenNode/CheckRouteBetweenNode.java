package Graph;

import java.util.ArrayList;

public class CheckRouteBetweenNode {
	
	Graph g;
	int [][] adjMat;
	ArrayList nodes=new ArrayList();
	
	public CheckRouteBetweenNode(Graph g)
	{
		this.g=g;
	}
	
	public void checkRoute(Node node1,Node node2)
	{

		adjMat=g.getAdjMat();
		nodes=g.getNodes(); 
		
		int start=nodes.indexOf(node1);
		int end=nodes.indexOf(node2);
		
	 if(start==-1 | end ==-1)
	 {
		 System.out.println("Nodes are not present in graph");
	 }
	 else
	 {
		if(adjMat[start][end]==1 | adjMat[end][start]==1)
		{
			System.out.println("Directly connected");
	
		}
		else
		{
			System.out.println("Directly  not  connected");
		}
	 }
		
	}

}
