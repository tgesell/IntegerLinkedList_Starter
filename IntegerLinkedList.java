public class IntegerLinkedList implements IntegerList //do not remove implements List.
{
    private Node head;
    private int size;

    public IntegerLinkedList()
    {
        head = null;
    }

    public void add(int value)
    {
        add(size, value);
    }

    public void add(int index, int value)
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

    public void set(int index, int value)
    {
        
    }
    
    public void clear()
    {
        
    }

    public void remove(int index)
    {

    }

    public int get(int index)
    {
        return -1;
    }


    public int size()
    {
        return -1;
    }
    
    public boolean isEmpty()
    {
        return true;
    }

    public boolean contains(int val)
    {
        return false;
    }

    public int indexOf(int val)
    {
        return -1;
    }

    public boolean equals(IntegerList other)
    {
        return false;
    }
    
    public String toString()
    {
       return "";
    }
}