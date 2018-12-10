public class ArrayGenerator {
    private int sizeOfArray;
    private int[] array;

    public ArrayGenerator(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
        array = new int[sizeOfArray];
        array = sequenceNumbersFiller(array);
    }

    public int[] getArray() {
        return array;
    }

    private int[] sequenceNumbersFiller(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        return array;
    }
}
