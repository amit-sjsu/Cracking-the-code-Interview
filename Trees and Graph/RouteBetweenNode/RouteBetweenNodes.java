package Graph;

import java.util.Stack;

public class RouteBetweenNodes {
	
	
	public boolean routeBetweenNodes(Graph g,Node start, Node end)
	{
		
		Stack dfs=new Stack();
		dfs.push(start);
		start.visited=true;
		
		while(!dfs.isEmpty()){
			
			Node temp=(Node) dfs.peek();
			Node child=g.getUnvisitedChildNode(temp);
			if(child!=null){
				if(child==end){
					g.clearNode();
					return true;
				}
				
				dfs.push(child);
				child.visited=true;
				
			}
			else
			{
				dfs.pop();
			}
				
			
		}
		g.clearNode();
		return false;
		
	}
	

}
