package Stack;

public class Main {

	public static void main(String[] args) {
	
		Stack thestack = new Stack(5);
		thestack.push('S');
		thestack.push('T');
		thestack.push('A');
		thestack.push('C');
		thestack.push('K');
		
		System.out.println(thestack.peek());
		
		while(!thestack.isEmpty())
		{
			char ch2 = thestack.pop();
			System.out.println("top :" + ch2);
		}

	}

}
