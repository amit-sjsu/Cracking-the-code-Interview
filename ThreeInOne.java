package CCIStackQueue;

public class ThreeInOne {

	int arr[]=new int[12];
	int len=arr.length/3;
	int top1=-1;
	int top2=len-1;
	int top3=2*len -1;

	public void push1(int data)
	{
		top1++;
		arr[top1]=data;
	}
	public void push2(int data)
	{
		top2++;
		arr[top2]=data;
		
	}
	public void push3(int data)
	{
		top3++;
		arr[top3]=data;
		
	}
	
	
	public void displayAll()
	{
		System.out.print("first Stack is :");
		for(int i=0;i<=top1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.print("\nSecond Stack is :");
		for(int i=len;i<=top2;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.print("\nThird Stack is :");
		for(int i=2*len;i<=top3;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		
	}
	
	
	public static void main(String args[])
	{
		ThreeInOne tio=new ThreeInOne();
		tio.push1(2);tio.push1(3);tio.push1(5);
		tio.push2(21);tio.push2(31);tio.push2(51);
		tio.push3(22);tio.push3(32);tio.push3(52);
		
		tio.displayAll();
		
	}
	
	
	
}
