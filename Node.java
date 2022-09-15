public class Node
{
    //instance data
    private Comparable val;
    private Node next;
    
    //Constructor
    public Node (Comparable value)
    {
        val = value;
    }

    public Node (Comparable value, Node next)
    {
        val = value;
    }
    
    //Two Accessor methods
    public Node getNext()
    {
        return next;
    }

    public Comparable getValue()
    {
        return val;
    }
    
    //Two Mutator methods
    public void setNext(Node n)
    {
        this.next = n;
    }

    public void setValue(Comparable value)
    {
        this.val = value;
    }
}
