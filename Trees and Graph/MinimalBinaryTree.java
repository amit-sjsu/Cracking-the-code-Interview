package CCITreesAndGraph;

import Trees.Node;

public class MinimalBinaryTree {
	

private class Node 
{
	
	public int data;
	Node left;
	Node right;
	
	public Node(int data)
	{
		
		this.data=data;
		this.left=null;
		this.right=null;
	}

}

	
	
	public Node createMinimalTree(int [] arr){
		
		return createMinimalTree(arr,0,arr.length-1);
		
	}
	
	public Node createMinimalTree(int [] arr, int start,int end){
		
		if(end <start){
			return null;
			
		}
		
		int mid=(start+end)/2;
		Node n=new Node(arr[mid]);
		n.left=createMinimalTree(arr,start,mid-1);
		n.right=createMinimalTree(arr,mid+1,end);
		
		return n;
		
			
		
	}
	
	public void display(Node root){
		
		if(root!=null)
		{	
		
		display(root.left);
		System.out.print(root.data + " ");
		display(root.right);
		}
		
	}
	
	
	
	
	
	
	public static void main(String args[]){
		
		int arr[]={1,2,3,4,5,6,7};
		MinimalBinaryTree bs=new MinimalBinaryTree();
		Node root=bs.createMinimalTree(arr);
		bs.display(root);
		
	}
	
	
	

}
