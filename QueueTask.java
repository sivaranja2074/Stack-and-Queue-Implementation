package myTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Queue<T>{
	private int MAX_SIZE;
	private int front,rear;
	private List<T> arr;
	
	Queue(int size){
		this.MAX_SIZE=size;
		this.arr = new ArrayList<>(size);
		front=-1;
		rear=-1;
	}
	public boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}
	public void enqueue(T value) {
		if(rear==MAX_SIZE) {
			throw new IndexOutOfBoundsException("Stack is Overflow");
		}
		rear++;
		if(front==-1) {
			front++;
		}
		arr.add(value);

	}
	public T dequeue() {
		if(front==-1||front>rear) {
			throw new IndexOutOfBoundsException("Stack is Underflow");
		}
		T top = arr.get(front++);
		return top;
	}
	
	public T peek() {
		if (arr.isEmpty()) {
			throw new IndexOutOfBoundsException("Stack is Underflow");
		}
		return arr.get(front);
	}
	public String toString() {
       if(front==-1) {
    	   throw new IndexOutOfBoundsException("Stack is Underflow");
       }
		String stackArray = "";
		for (int i = front; i < rear; i++) {
			stackArray += String.valueOf(arr.get(i)) + ",";
		}
		stackArray += String.valueOf(arr.get(rear));

		return stackArray;
	}
	
	
	
	
	
}
public class QueueTask {
	public static void main(String[] args) {
		Queue<String> testobj=new Queue<String>(20);
		while(true)
		{
			System.out.println(" 1 - enqueue / 2 - dequeue / 3 - IsEmpty / 4 - Peek/  5 - Display/ 6 - Exit");
			Scanner scanner=new Scanner(System.in);
			BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ));
		    int choose=scanner.nextInt();
		switch(choose) {
		case 1:
		{
			System.out.println("Enter the enqueue element");
			String enqueueElement= new String();
			enqueueElement = scanner.next();
			testobj.enqueue(enqueueElement);
			break;
		}
		case 2:
			{System.out.println("D Element : " + testobj.dequeue());break;}
			
		case 3:
		{
			System.out.println("Is empty : " + testobj.isEmpty());
			break;
		}
		case 4:
		{
			System.out.println("Peek element : " + testobj.peek());break;
		}
		
		case 5:
		{
			
			System.out.println("element : " + testobj);
			break;
		}
		case 6:
		{
			return;
		}
		default :
		{ System.out.println("Invalid Option");}
	    
	}
		
}
	}
}
