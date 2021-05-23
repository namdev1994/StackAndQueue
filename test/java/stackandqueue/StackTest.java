package stackandqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
   
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
}
