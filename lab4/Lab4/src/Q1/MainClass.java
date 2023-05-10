package Q1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Tree t1 = new Tree();
		
		t1.insert(149, "Anusha");
		t1.insert(167, "Kosala");
		t1.insert(047, "Dinusha");
		t1.insert(066, "Mihiri");
		t1.insert(159, "Jayani");
		t1.insert(118, "Nimal");
		t1.insert(195, "Nishantha");
		t1.insert(034, "Avodya");
		t1.insert(105, "Bimali");
		t1.insert(133, "Sampath");
		
		System.out.println("\n InOrder(left,root,right)\n");
		t1.TraverseinOrder();
		
		System.out.println("\n InOrder(left,root,right)\n");
		t1.TraverseinOrder();
		
		System.out.println("\n InOrder(left,root,right)\n");
		t1.TraverseinOrder();
		
		int value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter Employee Number :");
		value = sc.nextInt();
		
		t1.find(value);
		System.out.println();
		
		t1.deleteAll();
		
		System.out.println("\n After Delete Method Calling");
		t1.callRecuursive(130);

	}

}
