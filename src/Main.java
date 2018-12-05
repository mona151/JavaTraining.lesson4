import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(1);
        System.out.println(Arrays.toString(dynamicArray.getArray()));
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        System.out.println(Arrays.toString(dynamicArray.getArray()));

        dynamicArray.remove(3);
        System.out.println(Arrays.toString(dynamicArray.getArray()));
    }
}
