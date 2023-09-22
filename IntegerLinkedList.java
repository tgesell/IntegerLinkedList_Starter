public class IntegerLinkedList implements IntegerList //do not remove implements List.
{
    private Node head;
    private int size;

    public IntegerLinkedList()
    {
        head = null;
        size = 0;
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
            size++;
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
            size++;
        }
        else
            throw new IndexOutOfBoundsException(index + "");
    }
    
    public void clear()
    {
        //add method body here
    }


    public int size()
    {
        return -1; //replace this
    }
    
    public boolean isEmpty()
    {
        return true; //replace this
    }

    
    public String toString()
    {
       return ""; //replace this
    }

    public boolean equals(List<Integer> otherList)
    {
        return false; //replace this
    }

    //add the rest of the methods required by the List interface (the IntegerList interface is just an extension of the List interface)
}