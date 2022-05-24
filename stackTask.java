package myTask;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.io.IOException;
import java.util.Scanner;

class Stack<T> {

	private int capacity;
	private int size;
	private int topOfStack;
	private List<T> arr;

	Stack(int size) {
		this.capacity = size;
		this.arr = new ArrayList<>(size);
		this.topOfStack = -1;

	}

	public boolean isEmpty() {
		if (topOfStack == -1) {
			return true;
		}
		return false;
	}

	public void push(T value) {
		if (capacity == topOfStack) {
			throw new IndexOutOfBoundsException("Stack is Overflow");
		}
		topOfStack = topOfStack + 1;
		if (arr.size() > topOfStack)
			arr.set(topOfStack, value);

		else
			arr.add(value);
		   size++;

	}

	public T pop() {
		if (arr.isEmpty()||topOfStack==-1) {
			throw new IndexOutOfBoundsException("Stack is Underflow");
		}

		T top = arr.get(topOfStack);
		topOfStack--;
		size--;
		return top;

	}

	public T peek() {
		if (arr.isEmpty()||topOfStack==-1) {
			throw new IndexOutOfBoundsException("Stack is Underflow");
		}
		return arr.get(topOfStack);
	}
	public int size() {
		return size;
	}
	
	public boolean search(T value) {
   
		for (int i = 0; i < topOfStack; i++) {
			if (arr.get(i).equals(value)) {
				return true;
			}
		
      }
		return false;

	}

	public String toString() {
		
		if (arr.isEmpty()||topOfStack==-1) {
			throw new IndexOutOfBoundsException("Stack is Underflow");
		}
		String stackArray = "";
		for (int i = 0; i < topOfStack; i++) {
			stackArray += String.valueOf(arr.get(i)) + ",";
		}
		stackArray += String.valueOf(arr.get(topOfStack));

		return stackArray;
	}


}

	public class stackTask {
		public static void main(String[] args) throws IOException {
			Stack<Object> obj = new Stack<Object>(10);
			
//			String str = scanner.nextLine();
			while(true)
			{
				System.out.println(" 1 - Push / 2 - Pop / 3 - IsEmpty / 4 - Peek/ 5 - Search\n 6 - Display/ 7 - Exit");
				Scanner scanner=new Scanner(System.in);
				BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ));
			    int choose=scanner.nextInt();
			switch(choose) {
			case 1:
			{
				System.out.println("Enter the push element");
				String pushElement= new String();
				pushElement = scanner.next();
				obj.push(pushElement);
				break;
			}
			case 2:
				{System.out.println("Pop Element : " + obj.pop());break;}
				
			case 3:
			{
				System.out.println("Is empty : " + obj.isEmpty());
				break;
			}
			case 4:
			{
				System.out.println("Peek element : " + obj.peek());break;
			}
			case 5:
			{
				System.out.println("Enter the search element");
				String searchElement=scanner.next();
				obj.search(searchElement);
				break;
			}
			case 6:
			{
				
				System.out.println("element : " + obj);
				break;
			}
			case 7:
			{
				return;
			}
			default :
			{ System.out.println("Invalid Option");}
		    
		}
			
	}
		
}
	}

