import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final ArrayList<Task> tasks;

    public interface TaskCondition {
        boolean check(Task task);
    }

    public TaskManager() {
        tasks = new ArrayList<Task>();
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    static TaskCondition isStartsWithD = task -> {return task.getName().charAt(0) == 'D';};

    static TaskCondition isIdenticalFirstAndLastDigits = task -> {return task.getName().charAt(0) == task.getName().charAt(task.getName().length()
     - 1);};

    static TaskCondition isEndWithC = task -> {return task.getName().charAt(task.getName().length() - 1) == 'c';};


    public ArrayList<Task> filter(TaskCondition condition) {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : this.tasks) {
            if (condition.check(task)) {
                result.add(task);
            }
        }
        return result;
    }
}


