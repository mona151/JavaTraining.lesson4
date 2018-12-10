import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionsUsage {
    private ArrayList<Integer> intList = new ArrayList<Integer>();

    public CollectionsUsage(int[] array) {
        for (int i = 0; i < array.length; i++) {
            intList.add(array[i]);
        }
    }
    public void shuffleList(){
        Collections.shuffle(intList);
    }
    public void printList(){
        System.out.println(intList);
    }
    public void areElementsUnique(){
        Set<Integer> set = new HashSet<Integer>(intList);
        if (set.size() == intList.size()){
            System.out.println("All elements in ArrayList are unique");
        } else {
            System.out.println("There are duplicates in ArrayList");
        }
    }
    public void addDuplicate(int value){
        intList.add(value);
    }

    public void removeOddNumbers(){
        intList.removeIf(i -> i % 2 != 0);
    }

    public void leastElement(){
        System.out.println("Least element in collection is " + Collections.min(intList));
    }

    private void sort(){
        Collections.sort(intList);
    }

    public void get2ndGreatestNumber(){
        sort();
        System.out.println("2nd greatest number in collection is " + intList.get(intList.size() - 2));
    }
}
