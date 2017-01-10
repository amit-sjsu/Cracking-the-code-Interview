package CCIStackQueue;

import java.util.Stack;

public class SortStack {
	
	
	Stack originalStack;
	Stack tempStack;
	
    public SortStack()
    {
    	originalStack=new Stack();
    	tempStack=new Stack();
    }
	
	public void add(int data)
	{
		originalStack.push(data);	
	}
	
	
	public void sort(){
		
		while(!originalStack.isEmpty())
		{
			int tmp=(int)originalStack.pop();
			while(!tempStack.isEmpty() && (int)tempStack.peek()>tmp)
			{
				
				originalStack.push(tempStack.pop());
				
			}
			
			tempStack.push(tmp);
			
		}
		
		
	}
	
	public void display()
	{
		while(!tempStack.isEmpty())
		{
			System.out.print(tempStack.pop()+ " ");
		}
	}
	
	
	
	
	public static void main(String args[]){
		
		SortStack qs=new SortStack();
		qs.add(51);
		qs.add(32);
		qs.add(83);
		qs.add(74);
		qs.add(5);
		
		qs.sort();
		qs.display();
		
		
	}
	

}
