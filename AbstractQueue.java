package exercise;

abstract public class AbstractQueue implements Queue{
    int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        while (size != 0) dequeue();
    }
}
