package javapractiseuc2;


import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

	@Test
    public void given3Number_WhenAddedToStack_ShouldHaveLastAddedNode() {
           MyNode<Integer> myFirstNode = new MyNode<>(70);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(56);
		   MyStack myStack = new MyStack();
		   myStack.push(myFirstNode);
		   myStack.push(mySecondNode);
		   myStack.push(myThirdNode);
		   //myStack.printStack();
           INode peak;
		   peak = myStack.peak();
		   Assert.assertEquals(myThirdNode, peak);
		   
	}	
	
	@Test
    public void given3NumberInStack_WhenPoped_ShouldReturnEmpty() {
           MyNode<Integer> myFirstNode = new MyNode<>(70);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(56);
		   MyStack myStack = new MyStack();
		   myStack.push(myFirstNode);
		   myStack.push(mySecondNode);
		   myStack.push(myThirdNode);
		   myStack.printStack();
           INode pop = myStack.pop();
           INode pop1 = myStack.pop();
           INode pop2 = myStack.pop();
           INode empty = myStack.isEmpty();
		   Assert.assertEquals( null , empty );
		   
	}		
	
	
}