public class IntegerLinkedList implements IntegerList //do not remove implements List.
{
    Node head;

    public IntegerLinkedList()
    {
        head = null;
    }

    public void add(int value)
    {
        head = new Node(value);
    }

    public void add(int index, int value)
    {

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