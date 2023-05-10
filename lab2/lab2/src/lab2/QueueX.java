package lab2;

public class QueueX {
	
	private int[] queueArr;
	private int maxSize;
	private int rear;
	private int front;
	private int nItems;
	
	//constructor implementation
	public QueueX(int s) {
		maxSize = s;
		queueArr = new int[maxSize];
		rear = -1;
		front = 0;
		nItems = 0;
	}
	
	//isEmpty method
	public boolean isEmpty() {
		return(nItems==0);
	}
	
	//isFull method
	public boolean isFull() {
		return(rear==(maxSize-1));
	}
	
	//insert method
	public void insert(int j) {
		if(rear == (maxSize-1)) {
			System.out.println("Queue is Full");
		}
		else {
			queueArr[++rear] = j;
			nItems++;
		}
	}
	
	//remove method
	public int remove() {
		if(nItems == 0) {
			System.out.println("Queue is Empty");
			return -99;
		}
		else {
			nItems--;
			return queueArr[front++];
		}
	}

}
