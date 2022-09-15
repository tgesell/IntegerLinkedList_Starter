//Do not modify this interface

public interface IntegerList {
    public void add(int x);

    public void add(int index, int x);

    public void set(int index, int x);

    public void clear();

    public void remove(int index);

    public int get(int index);

    public int size();

    public boolean isEmpty();

    public boolean contains(int val);

    public int indexOf(int val);

    public boolean equals(IntegerList other);

    public String toString();
}
