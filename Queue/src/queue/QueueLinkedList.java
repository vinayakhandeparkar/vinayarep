package queue;

import java.util.LinkedList;

public class QueueLinkedList implements Queue{
	LinkedList<Integer> l =new LinkedList<Integer>();
	public boolean enqueue(int data) {
		l.addLast(data);
		return true;
	}

	public boolean dequeue() {

		if(l.isEmpty()) {  
			//System.out.println("No elemets in the queue ");  
			return false;
		}
		else{
			l.removeFirst();
			return true;
		}  
	}

	public void display() {
		System.out.println("Elements in the Queue : "); 
		if(l.isEmpty()) {  
			System.out.println("No elemets in the queue ");  
		}
		else
		{
			for(int obj:l)  {
				System.out.println(obj);  
			} 
		}
	}

}
