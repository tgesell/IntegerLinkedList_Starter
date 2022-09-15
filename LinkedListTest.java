//This is only a partial test to get you started.
//Make sure to test each of your methods
//Make sure to test edge cases for each method

public class LinkedListTest
{
    public static void main(String[] args)
    {
        IntegerLinkedList myList = new IntegerLinkedList();
        
        System.out.println("Display empty list: " + myList);
        System.out.println("isEmpty()?: " + myList.isEmpty());
        
        
        myList.add(5);
        System.out.println("Add 5 to end of empty list: " + myList);
        System.out.println("isEmpty()?: " + myList.isEmpty());
        
        myList.clear();
        System.out.println("Display list after clear(): " + myList);
        System.out.println("isEmpty()?: " + myList.isEmpty());
        
        myList.add(5,0);
        System.out.println("Add 5 to position 0 of empty list: " + myList);
        System.out.println("isEmpty()?: " + myList.isEmpty());
      
        myList.add(10);
        System.out.println("Add 10 to end of list: " + myList);
        System.out.println("isEmpty()?: " + myList.isEmpty());
        
        myList.add(11);
        System.out.println("Add 11 to end of list: " + myList);
        
        myList.add(7,1);
        System.out.println("Add 7 to position 1 of list: " + myList);
        
        myList.add(2,0);
        System.out.println("Add 2 to position 0 of list: " + myList);
       
        myList.add(12,5);
        System.out.println("Add 12 to position 5 (the next unused -- \"last\" -- position of list: " + myList);
        
        myList.remove(0);
        System.out.println("Remove element 0 from the list: " + myList);
        
        myList.remove(4);
        System.out.println("Remove element 4 (the last element) from the list: " + myList);
        
        myList.remove(2);
        System.out.println("Remove element 2 from the list: " + myList);
        System.out.println("isEmpty()?: " + myList.isEmpty());
        
        
        System.out.print("Multiply all values by 2 using set(i) and get(i): ");
        for (int i=0; i<myList.size(); i++)
        {
            myList.set(i,myList.get(i) * 2);
            System.out.print(myList.get(i) + " " );
        }
        System.out.println();
        
        myList.clear();
        System.out.println("Display list after clear(): " + myList);
        System.out.println("isEmpty()?: " + myList.isEmpty());
        
    }       
}
