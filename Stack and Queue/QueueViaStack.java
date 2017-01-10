package CCIStackQueue;
import java.util.*;
public class QueueViaStack {
	
	Stack newStack=new Stack();
	Stack oldStack=new Stack();
	

	
	public void add(int data)
	{
		newStack.push(data);
		
	}
	
	
	public void suffle(){
		
		if(oldStack.isEmpty())
		{
			while(!newStack.isEmpty()){
				
				oldStack.push(newStack.pop());
			}
		}
		
	}
	
	public void remove()
	{
		suffle();
		if(!oldStack.isEmpty())
		{
			
			System.out.println(oldStack.pop());
		}
		
	}
	
	
	
	
	public static void main(String args[]){
		
		QueueViaStack qs=new QueueViaStack();
		qs.add(51);
		qs.add(52);
		qs.add(53);
		qs.add(54);
		qs.add(55);
		
		qs.remove();
		qs.remove();
		qs.remove();
		qs.remove();
		qs.remove();
		qs.remove();
		qs.remove();
		qs.remove();
		
		
		
	}
	

}
