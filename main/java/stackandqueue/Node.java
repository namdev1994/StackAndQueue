package stackandqueue;

public class Node <T> implements INode<T>{
    private T data;
    private INode next;


    // Constructor with node fields
    public Node(T data) {
        this.setData(data);
        this.setNext(null);
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}

