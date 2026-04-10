class Solution {
    public int[] replaceElements(int[] arr) {
        int notebook = -1;

        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = notebook;
            notebook = Math.max(temp, notebook);
        }

        return arr;
    }
}