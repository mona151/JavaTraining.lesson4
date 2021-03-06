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
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);
        System.out.println(Arrays.toString(dynamicArray.getArray()));

        dynamicArray.remove(5);
        System.out.println(Arrays.toString(dynamicArray.getArray()));

        dynamicArray.remove(0);
        System.out.println(Arrays.toString(dynamicArray.getArray()));

        ArrayGenerator arrayGenerator = new ArrayGenerator(40);
        System.out.println(Arrays.toString(arrayGenerator.getArray()));

        CollectionsUsage collectionsUsage = new CollectionsUsage(arrayGenerator.getArray());
        collectionsUsage.printList();
        collectionsUsage.shuffleList();
        collectionsUsage.printList();
        collectionsUsage.areElementsUnique();
       /* collectionsUsage.addDuplicate(10);
        collectionsUsage.areElementsUnique();*/
       collectionsUsage.removeOddNumbers();
       collectionsUsage.printList();
       collectionsUsage.leastElement();
       collectionsUsage. get2ndGreatestNumber();
    }
}
