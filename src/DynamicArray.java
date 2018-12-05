import java.util.Arrays;

public class DynamicArray {
    private int arraySize = 0;
    private int[] array = new int[arraySize];
    public DynamicArray(int arraySize) {
        this.arraySize = arraySize;
    }
    public void add(int value){
        array = append(array, value);
    }
    public int[] getArray() {
        return array;
    }
    public void remove (int index){
        array = arrayShifter(index);
    }

    private int[] arrayShifter (int index){
        int[] result = Arrays.copyOf(array,array.length - 1);
        return result;
      /*  for (int i = index; i >= array.length; i++) {
            result[i] = array[i+1];
        }*/

    }
    private int[] append(int[] array, int value) {
        int[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = value;
        return result;
    }
}
