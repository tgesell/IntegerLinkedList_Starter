public class IntegerLinkedList implements IntegerList //do not remove implements List.
{
    private Node head;
    private int size;

    public IntegerLinkedList()
    {
        head = null;
    }

    public void add(Integer value)
    {
        add(size, value);
    }

    public void add(int index, Integer value)
    {
        Node n = new Node(value);
        if (index == 0) {
            n.setNext(head);
            head = n;
        }
        else if (0 < index && index <= size)
        {
            Node current = head;
            for (int i=0; i<index-1; i++)
            {
                current = current.getNext();
            }
            n.setNext(current.getNext());
            current.setNext(n);
        }
        else
            throw new IndexOutOfBoundsException();
    }
    
    public void clear()
    {
        
    }


    public int size()
    {
        return -1;
    }
    
    public boolean isEmpty()
    {
        return true;
    }

    
    public String toString()
    {
       return "";
    }
}