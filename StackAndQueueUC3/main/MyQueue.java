package javapractiseuc3;


public class MyQueue {
	private final MyLinkedList myLinkedList ;
	
	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}
	
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	
	public INode peak() {
		return myLinkedList.head ;
		
	}
	
	public INode pop() {
		return myLinkedList.pop() ;
		
	}
	
	public INode isEmpty() {
		myLinkedList.printMyNodes();
		return null;
	}
	
	
	
	
}