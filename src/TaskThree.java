import java.util.HashMap;
import java.util.Objects;

public class TaskThree {

    private final HashMap<String, Integer> data = new HashMap<>();

    public void addData(String keyString, Integer value) {
        if (data.containsKey(keyString) && data.get(keyString) == value) {
            throw new IllegalArgumentException("Такой ключ уже есть");
        } else {
            data.put(keyString, value);
        }
    }

    @Override
    public String toString() {
        return "TaskThree{" +
                "data=" + data +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        TaskThree taskThree = (TaskThree) o;
//        return Objects.equals(data, taskThree.data);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(data);
//    }
}
