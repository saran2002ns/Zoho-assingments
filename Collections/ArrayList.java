public class ArrayList<T> {
    private Object[] array;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        array = new Object[INITIAL_CAPACITY];
    }

    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    public void set(int index, T element) {
        checkIndex(index);
        array[index] = element;
    }

    public T remove(int index) {
        checkIndex(index);
        T removedElement = (T) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null; /
        return removedElement;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
}