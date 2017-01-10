package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
	
LinkedList<Dog> dog=new LinkedList<Dog>();
LinkedList <Cat> cat=new LinkedList<Cat>();

private int order=0;

public void enqueue(Animal a){
	
	a.setOrder(order);
	order++;
	
	if(a instanceof Dog)
		dog.addLast((Dog)a);
	
	else if (a instanceof Cat)
		cat.addLast((Cat)a);		
	
}

public Animal dequeueAny(){
	
if(dog.size()==0)
	return dequeueCats();
else if (cat.size()==0)
	return dequeueDogs();

Dog d=dog.peek();
Cat c=cat.peek();

if(d.isOlderThan(c))
	return dequeueDogs();
else
	return dequeueCats();
	
}	

public Dog dequeueDogs(){
	return dog.poll();
	
}

public Cat dequeueCats(){
	return cat.poll();
}
	
	
public static void main(String args[])
{
	AnimalShelter as=new AnimalShelter();
	
	Dog d=new Dog("bullDog");
	Dog d1=new Dog("bullDog1");
	
	Cat c=new Cat("Meao");
	Cat c1=new Cat("Meao1");
	
	as.enqueue(d);
	as.enqueue(d1);
	as.enqueue(c);
	as.enqueue(c1);
	
	System.out.println(as.dequeueCats().name);
	
}

}
