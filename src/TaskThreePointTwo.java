import java.util.*;

public class TaskThreePointTwo {

    private final String key = "newList";
    Random random = new Random();
    Map<String, List<Integer>> newMap = new HashMap<>();
    Map<String, Integer> newMap2 = new HashMap<>();

    public void addDataSumOfNumbers(Integer number) {
        newMap2.put(key, number);
    }

    public List<Integer> addDataToList(int i) {
        List<Integer> newList = new LinkedList<>();
        while (newList.size() < i) {
            newList.add(random.nextInt(1000));
        }
        return newList;
    }

    public void addDataToMap(List<Integer> list) {
        newMap.put(key, list);
    }

    public Map<String, List<Integer>> getNewMap() {
        return newMap;
    }

    public List<Integer> getNewList() {
        return newMap.get(key);
    }

    public int sumOfNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;

        }
        return sum;
    }

    @Override

    public String toString() {
        return "TaskThreePointTwo{" +
                ", newMap=" + newMap +
                '}';
    }
}
