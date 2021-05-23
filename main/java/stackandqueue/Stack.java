package stackandqueue;

public class Stack<T> {
    LinkedList<Integer> myLinkedList = new LinkedList<>();

    /* push the Node to stack */
    public void push(INode newNode) {
        myLinkedList.addFirst(newNode);
    }

    /* peek the top node in stack */
    public INode peek() {
        return myLinkedList.head;
    }
}

