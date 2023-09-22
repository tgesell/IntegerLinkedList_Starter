public class Node<E extends Comparable>
{
    //instance data
    private E val;
    private Node next;
    
    //Constructor
    public Node (E value)
    {
        val = value;
    }

    public Node (E value, Node next)
    {
        val = value;
        this.next = next;
    }
    
    //Two Accessor methods
    public Node getNext()
    {
        return next;
    }

    public E getValue()
    {
        return val;
    }
    
    //Two Mutator methods
    public void setNext(Node n)
    {
        this.next = n;
    }

    public void setValue(E value)
    {
        this.val = value;
    }
}
