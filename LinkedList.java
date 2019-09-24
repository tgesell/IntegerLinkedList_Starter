public class LinkedList
{
    Node first;
    int size = 0;  //it saves time in the size() method, if you keep track of size here.

    public LinkedList()
    {
        first = null;
    }

    public void add(Node n)
    {
        //Case 1: we are adding this Node to an empty list
        if (first == null)
            first = n;
        //Case 2: we are adding this Node to the end of a non-empty list
        else
        {
            Node current = first;
            //traverse to the last node in the list (the Node whose next is null)
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(n);
        }
        
        size++; //optional - if you are keeping track of size, in both cases add one to size
        
        //There are no Exception cases here, because you should always be able to add an element to the end of a list.
    }
    public void add(int value)
    {
        add(new Node(value));
    }
    public void add(Node n, int index)
    {
        //Case 1: This Node is being added to the beginning of the list
        if(index == 0)
        {
            n.setNext(first);
            first = n;
        }
        //Case 2:  This Node is being added after an existing Node
        else
        {
            Node current = first;
            int i = 0;
            //traverse to the Node before the insert position (i == index-1)
            while (current.getNext() != null && i < index-1)
            {
                current = current.getNext();
                i++;
            }
            //A Node is found whose position directly precedes the desired insert position
            if (i == index-1)
            {
                n.setNext(current.getNext());
                current.setNext(n);
            }
            //Exception Case: There is no Node whose position directly precedes the desired insert position
            else
                throw new IndexOutOfBoundsException("Index out of range for this list");
        }
        size++;
    }
    public void add(int value, int index)
    {
        add(new Node(value),index);
    }

    public void set(int index, int x)
    {
        Node current = first;
        //traverse to the Node whose position we wish to set
        for(int i=0; current != null && i<index; i++)
            current = current.getNext();
        //Case 1: as long as we did not get to null before a Node in that position was found:
        if (current != null)
            current.setValue(x);
        else //Exception Case: if we did get to null before a Node in that position was found:
            throw new IndexOutOfBoundsException("Index Out of range: " + index);
    }
    
    public void clear()
    {
        first = null;
        size = 0;
    }

    public int get(int index)
    {
        Node current = first;
        //traverse to the Node whose position we wish to get
        for (int i=0; current != null && i<index; i++)
            current = current.getNext();
        //Case 1: as long as we did not get to null before a Node in that position was found:
        if (current != null)
            return current.getValue();
        else //Exception Case: if we did get to null before a Node in that position was found:
            throw new IndexOutOfBoundsException("Index Out of range: " + index);
    }

    public void remove(int index)
    {
        Node current = first;
        //Case 1: We are removing the very first element
        if (index == 0)
        {
            first = first.getNext();
            size--;
            return;
        }
        //Traverse to the item preceding the item to be removed
        for(int i=0; current != null && i < index-1; i++)
        {
            current = current.getNext();
        }
        //current should be the node BEFORE the Node to remove if a node exists at that index
        //if such a Node exists:
        if (current != null && current.getNext() != null)
        {
            current.setNext(current.getNext().getNext());
            size--;
        }
        else //Exception Case: if we get to null before a Node in that position was found:
            throw new IndexOutOfBoundsException("Index Out of range: " + index);
    }

    public int size()
    {
        return size;
        //another option would be to traverse through the list, counting each Node.
        // int count=0;
        // for ( Node current = first; current!= null; current = current.getNext())
            // count++;
        // return count;
    }
    
    public boolean isEmpty()
    {
        return first == null;
    }
    
    public String toString()
    {
        Node current = first;
        String result = "[ ";
        while (current != null)
        {
            result = result + current.getValue() + ",";
            current = current.getNext();
        }     
        return result.substring(0,result.length()-1) + " ] n=" + size();
    }
}