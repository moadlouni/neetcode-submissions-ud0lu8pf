class DynamicArray {

    private int size;
    private int[] arr;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        // if number of elements in the array is equal
        // to the capacity i.e. list length
        if(size == arr.length){
            resize();
        }

        arr[size] = n;
        size++;
    }

    public int popback() {
        int popVal = arr[size-1];
        size--;
        return popVal;
    }

    private void resize() {
        int[] tempArr = new int[arr.length * 2];
        for (int i =0; i < size; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
