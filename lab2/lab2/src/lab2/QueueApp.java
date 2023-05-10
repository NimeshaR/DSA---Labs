package lab2;
import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		
		QueueX mainQueue = new QueueX(5);
		
		Scanner scanner = new Scanner(System.in);
		
		int inputStr;
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enter transaction ID :");
			inputStr = scanner.nextInt();
			mainQueue.insert(inputStr);
		}
		
		//object creation for Even Queue and Odd Queue from the QueueX Class
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		int value;
		
		while(!mainQueue.isEmpty()) {
			value = mainQueue.remove();
			
			if(value %2 == 0) {
				evenQueue.insert(value);
			}
			else {
				oddQueue.insert(value);
			}
		}
		
		//removing elements and print with the PC number
		System.out.println("PC1");
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction :" + evenQueue.remove());
		}
		
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
			System.out.println("Transaction :" + oddQueue.remove());
		}

	}

}
