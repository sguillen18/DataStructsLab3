package Lab3;


public class LinkedQueue <T> implements QueueInterface <T> {
	
	private Node firstNode;
	private Node lastNode;
	
	//defines Nodes
	private class Node {
		T data;
		Node next;
		
		public Node(T data, Node nextNode) {
			this.data = data;
			next = nextNode;
		}
		
		public Node(T newData) {
			this(newData, null);
		}
		
		public T getData() {
			return data;
		}
		
		/*public void setData(T newData) {
			data = newData;
		}*/
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node newNext) {
			next = newNext;
		}
	}
	
	public LinkedQueue() {
		firstNode = null;
		lastNode = null;
	}

	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry);
		
		if(isEmpty()) {
			firstNode = newNode;
		}
		
		else {
			lastNode.setNext(newNode);
		}
		lastNode = newNode;
	}
	
	public T dequeue() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		
		T front =  firstNode.getData();
		firstNode = firstNode.getNext();
		if(firstNode == null) {
			lastNode = null;
		}
		return front;
	}
	
	public T getFront() {
		return null;
	}
	
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	public void clear() {
		firstNode = null;
		lastNode = null;
	}
}
