package tp1ex3;

class CustomArrayList {
	private Object[] array;
    private int size;
    public CustomArrayList() {
        this.array = new Object[10];
        this.size = 0;
    }
    public CustomArrayList(int initialSize) {
        this.array = new Object[initialSize];
        this.size = 0;
    }
    public void add(int index,Object obj) {
    	if (size == array.length) {
            int newCapacity = array.length * 2;
            array = java.util.Arrays.copyOf(array, newCapacity);
        }
    	if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = obj;
        size++;
    }
    public void add(Object obj) {
    	this.add(size, obj);
    }
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isIn(Object x) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(x)) {
                return true;
            }
        }
        return false;

    }
    public int find(Object x) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
    
    public void remove(Object x) {
        int index = this.find(x);
        if (index != -1) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            array[--size] = null; // Set the last element to null
        }
    }
}
