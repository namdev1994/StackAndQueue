package stackandqueue;

public class Queue<T> {
    LinkedList<Integer> myLinkedList = new LinkedList<>();

    /* push the Node to stack */
    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    /* peek the top node in stack */
    public INode peek() {
        return myLinkedList.head;
    }
    /* dequeue node in the queue */
    public INode dequeue() {
        return myLinkedList.pop();
    }
}
