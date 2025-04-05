/**

 * 
 */
package stack;
import java.io.PushbackInputStream;
import java.util.Iterator;
import java.util.Scanner;



public class Stack {
	static int[] a = new int[10];
	static int top=-1;
	static int size = a.length-1;
	public static void push(int k) {
		if(top==size) {
			System.out.println("array size is overflow ");
		}else {
			a[++top] = k;
		}
	}
	public static void pop() 
	{
		if(top==-1) {
			System.out.println("This array have no element");
		}else {
			top--;
		}
	}
	public static void display() {
		for (int i =0;i<=top;i++) {
			System.out.println("Array elements are  : "+a[i]);	
		}
	}
	public static void peek() {
		System.out.println(a[top]);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		boolean flag = true;
		while(flag) 
		{
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. display");
			System.out.println("5. exit");
			System.out.println("-----------------------");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
		switch (ch) 
		{
		case 1: 
		{
			System.out.println("enter a value to push");
			int k = sc.nextInt();
			push(k);
			System.out.println("value pushed succesfully");
			System.out.println("--------------------------");
			display();
		}
		case 2: 
		{
			pop();
			display();
			break;
		}
		case 3: 
		{
			peek();
			display();
			break;
		}
		case 4: 
		{
			display();
			break;
		}
		case 5: 
		{
			flag = false;
			break;
		}
		
		default: System.out.println("wrong input");
			
		}
	} 
}
}
	
