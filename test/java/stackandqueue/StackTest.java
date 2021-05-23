package stackandqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    /**
     * this will check the stack has created or not.
     */

    @Test
    public void IfStackIsCreatedShouldReturnTrue() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);
        Stack<Integer> stack = new Stack<>();
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        INode peek = stack.peek();
        Assertions.assertEquals(peek, myThirdNode);
    }
    //Pop node which is on top of stack
    @Test
    public void IfStackIsPopOrPeekShouldReturnTrue() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<>();
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        INode popStack = stack.pop();
        INode peek = stack.peek();
        Assertions.assertEquals(popStack, myThirdNode);
    }
}
