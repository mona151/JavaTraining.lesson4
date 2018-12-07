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
        array = arrayElementRemover(array, index);
    }

    private int[] arrayElementRemover(int[] array, int index){
        int[] result = new int[array.length-1];
        if (index == 0){
            result = Arrays.copyOfRange(array, 1, array.length);
        }
        if (index == array.length){
            result = Arrays.copyOfRange(array, 0, array.length-1);
        }
        if (index > 0 && index < array.length){
            for (int i = 0; i < index; i++) {
                result[i] = array[i];
            }
            for (int i = index; i < array.length - 1; i++) {
                result[i] = array[i+1];
            }
        }
        return result;
    }


    private int[] append(int[] array, int value) {
        int[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = value;
        return result;
    }
}
